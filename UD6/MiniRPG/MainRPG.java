package MiniRPG;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRPG {
    public static void main(String[] args) {
        ArrayList<Personaje> equipo = new ArrayList<>();
        equipo.add(new Caballero("caballero1", 100, 20, 3));
        equipo.add(new Paladin("paladin1", 125, 15, 3));
        equipo.add(new Bardo("bardo1", 90, 10, 3));
        equipo.add(new Ballestero("ballestero1", 80, 20, 3));
        equipo.add(new HechiceroDeLuz("magoLuz1", 80, 15, 3, 50));
        equipo.add(new HechiceroOscuro("magoOscuro1", 70, 20, 3, 40));
        int turno = 1;
        int atacante, defensor = 0;

        for (int i = 0; i < 15; i++) {
            System.out.println("================");
            System.out.println("||  TURNO " + turno + "  ||");
            System.out.println("================");
            do {
                atacante = (int) (Math.random() * equipo.size());
                defensor = (int) (Math.random() * equipo.size());
            } while (atacante == defensor || !equipo.get(atacante).estaVivo() || !equipo.get(defensor).estaVivo());
            System.out.println("Atacante de turno actual: ");
            System.out.println(equipo.get(atacante).toString());
            System.out.println("Defensor de turno actual: ");
            System.out.println(equipo.get(defensor).toString());
            if (equipo.get(atacante) instanceof Mago magoAtacante) {
                double ataqueEspecial = Math.random();
                if (ataqueEspecial <= 0.3) {
                    System.out.println("El atacante " + equipo.get(atacante).nombre + " usa un ataque especial!");
                    magoAtacante.habilidadEspecial(equipo.get(defensor));
                } else {
                    System.out.println(equipo.get(atacante).getClass().getSimpleName() + " " + equipo.get(atacante).nombre + " ataca a " + equipo.get(defensor).getClass().getSimpleName() + " " + equipo.get(defensor).nombre);

                    magoAtacante.atacar(equipo.get(defensor));
                }
                System.out.println(equipo.get(defensor).getClass().getSimpleName() + " " + equipo.get(defensor).nombre + " ahora tiene " + equipo.get(defensor).vida + " HP");
            } else if (equipo.get(atacante) instanceof Ballestero ballesteroAtacante && ballesteroAtacante.getRecargado()) {
                continue;
            } else {
                System.out.println(equipo.get(atacante).getClass().getSimpleName() + " " + equipo.get(atacante).nombre + " ataca a " + equipo.get(defensor).getClass().getSimpleName() + " " + equipo.get(defensor).nombre);
                equipo.get(atacante).atacar(equipo.get(defensor));
                System.out.println(equipo.get(defensor).getClass().getSimpleName() + " " + equipo.get(defensor).nombre + " ahora tiene " + equipo.get(defensor).vida + " HP");
            }

            if (!equipo.get(defensor).estaVivo()) {
                System.out.println(equipo.get(defensor).getClass().getSimpleName() + " " + equipo.get(defensor).nombre + " ha muerto!");
            }
            turno++;
        }
        System.out.println("\n ===== RESULTADOS DE BATALLA =====");
        for (Personaje personaje : equipo) {
            System.out.println(personaje.toString());
            System.out.println("===================");
        }
    }
}
