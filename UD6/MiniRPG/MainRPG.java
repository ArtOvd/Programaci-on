package MiniRPG;

import PR6_1.Persona;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainRPG {
    public static Random aleatorio = new Random();

    public static void main(String[] args) {
        ArrayList<Personaje> equipo1 = new ArrayList<>();
        equipo1.add(new Caballero("caballero1", 100, 20, 3));
        equipo1.add(new Paladin("paladin1", 125, 15, 3));
        equipo1.add(new Bardo("bardo1", 90, 10, 3));
        equipo1.add(new Ballestero("ballestero1", 80, 20, 3));
        equipo1.add(new HechiceroDeLuz("magoLuz1", 80, 15, 3, 50));
        equipo1.add(new HechiceroOscuro("magoOscuro1", 70, 20, 3, 40));
        ArrayList<Personaje> equipo2 = new ArrayList<>();
        equipo2.add(new Caballero("caballero2", 100, 20, 3));
        equipo2.add(new Paladin("paladin2", 125, 15, 3));
        equipo2.add(new Bardo("bardo2", 90, 10, 3));
        equipo2.add(new Ballestero("ballestero2", 80, 20, 3));
        equipo2.add(new HechiceroDeLuz("magoLuz2", 80, 15, 3, 50));
        equipo2.add(new HechiceroOscuro("magoOscuro2", 70, 20, 3, 40));
        int turno = 1;
        Personaje atacante, defensor;
        boolean turnoEquipo1 = true;
        ArrayList<Personaje> aliados = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            aliados.clear();
            System.out.println("================");
            System.out.println("||  TURNO " + turno + "  ||");
            System.out.println("================");
            do {
                if (turnoEquipo1) {
                    atacante = equipo1.get(aleatorio.nextInt(equipo1.size()));
                    defensor = equipo2.get(aleatorio.nextInt(equipo2.size()));
                    aliados.addAll(equipo1);
                } else {
                    atacante = equipo2.get(aleatorio.nextInt(equipo1.size()));
                    defensor = equipo1.get(aleatorio.nextInt(equipo1.size()));
                    aliados.addAll(equipo2);
                }
            } while (!atacante.estaVivo() || !defensor.estaVivo());
            turnoEquipo1 = !turnoEquipo1;
            System.out.println("Atacante de turno actual: ");
            System.out.println(atacante);
            System.out.println("Defensor de turno actual: ");
            System.out.println(defensor);

            switch (atacante) {
                case HechiceroOscuro magoOscuro -> turnoMagoOscuro(magoOscuro, defensor, aliados);
                case HechiceroDeLuz magoLuz -> turnoMagoLuz(magoLuz, defensor, aliados);
                case Paladin paladin -> turnoPaladin(paladin, defensor, aliados);
                case Ballestero ballesteroAtacante when ballesteroAtacante.getRecargado() ->
                        System.out.println("Ataque de ballestero todavía está recargando...");
                default -> {
                    ejecutarAtaqueNormal(atacante, defensor);
                }
            }
            if (!defensor.estaVivo()) {
                System.out.println(defensor.getClass().getSimpleName() + " " + defensor.nombre + " ha muerto!");
            }
            turno++;
        }
        System.out.println("\n ===== RESULTADOS DE BATALLA =====");
        System.out.println("EQUIPO 1:");
        for (Personaje personaje : equipo1) {
            System.out.println(personaje.toString());
            System.out.println("===================");
        }
        System.out.println("||||||||||||||||||||||||||||||||");
        System.out.println("EQUIPO 2:");
        for (Personaje personaje : equipo2) {
            System.out.println(personaje.toString());
            System.out.println("===================");
        }
    }

    public static void mostrarMensajeAtaque(Personaje atacante, Personaje defensor) {
        System.out.println(atacante.getClass().getSimpleName() + " " + atacante.nombre + " ataca a " + defensor.getClass().getSimpleName() + " " + defensor.nombre);
    }

    public static void mostrarMensajeHP(Personaje atacante, Personaje defensor) {
        System.out.println(defensor.getClass().getSimpleName() + " " + defensor.nombre + " tiene " + defensor.vida + " HP");
    }

    public static void ejecutarAtaqueNormal(Personaje atacante, Personaje defensor) {
        mostrarMensajeAtaque(atacante, defensor);
        atacante.atacar(defensor);
        mostrarMensajeHP(atacante, defensor);
    }

    public static void ejecutarHabilidadEspecial(Mago mago, Personaje defensor) {
        mostrarMensajeAtaque(mago, defensor);
        mago.habilidadEspecial(defensor);
        mostrarMensajeHP(mago, defensor);
    }

    public static void turnoPaladin(Paladin paladin, Personaje enemigo, ArrayList<Personaje> aliados) {
        Personaje herido = buscarHerido(aliados);
        if (herido != null) {
            if (Math.random() <= 0.70) {
                paladin.sanar(herido);
            } else {
                ejecutarAtaqueNormal(paladin, enemigo);
            }
        } else {
            if (Math.random() <= 0.50) {
                ejecutarAtaqueNormal(paladin, enemigo);
            } else {
                paladin.habilidadBuff(aliados);
            }
        }
    }

    public static void turnoMagoOscuro(HechiceroOscuro mago, Personaje enemigo, ArrayList<Personaje> aliados) {
        if (Math.random() <= 0.33) {
            mago.habilidadBuff(aliados);
        } else {
            if (Math.random() <= 0.33) {
                ejecutarHabilidadEspecial(mago, enemigo);
            } else {
                ejecutarAtaqueNormal(mago, enemigo);
            }

        }
    }

    public static void turnoMagoLuz(HechiceroDeLuz mago, Personaje enemigo, ArrayList<Personaje> aliados) {
        double decision = Math.random();
        if (decision <= 0.5) {
            Personaje aliadoCurar = buscarHerido(aliados);
            if (aliadoCurar != null) {
                mago.sanar(aliadoCurar);
            } else {
                ejecutarAtaqueNormal(mago, enemigo);
            }
        } else if (decision <= 0.75) {
            ejecutarHabilidadEspecial(mago, enemigo);
        } else {
            ejecutarAtaqueNormal(mago, enemigo);
        }
    }

    public static Personaje buscarHerido(ArrayList<Personaje> aliados) {
        Personaje aliadoCurar = null;
        for (Personaje p : aliados) {
            if (p.estaVivo() && p.vida < p.vidaMax) {
                aliadoCurar = p;
                return p;
            }
        }
        return null;
    }
}

