package MiniRPG;

import java.util.ArrayList;

public class Paladin extends Guerrero implements ISanador, ISupport {


    public Paladin(String nombre, int vida, int ataqueBase, int nivel) {
        super(nombre, vida, ataqueBase, nivel);
    }

    @Override
    public void atacar(Personaje enemigo) {
        int ataque = (int) (ataqueBase + (nivel * 1.5));
        enemigo.recibirDano(ataque);
    }

    @Override
    public void sanar(Personaje objetivo) {
        if (objetivo.vida >= objetivo.vidaMax) {
            return;
        }
        int vidaAntes = objetivo.vida;
        objetivo.vida = Math.min(objetivo.vida + getCantidadSanacion(), objetivo.vidaMax);
        int curado = objetivo.vida - vidaAntes;
        System.out.println(this.nombre + " sana a " + objetivo.nombre + " +" + curado + " HP");
    }

    @Override
    public int getCantidadSanacion() {
        return 10;
    }

    @Override
    public void habilidadBuff(ArrayList<Personaje> aliados) {
        this.ataqueBase += 5;
        if (Math.random() < 0.35) {
            for (Personaje aliado : aliados) {
                if (!aliado.equals(this) && aliado.estaVivo()) {
                    aliado.ataqueBase += 3;
                }
            }
            System.out.println(this.nombre + " activa AURA: +3 ataque al equipo.");
        } else {
            Personaje aliadoObjetivo = null;
            for (Personaje p : aliados) {
                if (p.estaVivo() && !p.equals(this)) {
                    aliadoObjetivo = p;
                    break;
                }
            }
            if (aliadoObjetivo != null) {
                aliadoObjetivo.ataqueBase += 7;
                System.out.println(this.nombre + " activa AURA: +7 ataque a " + aliadoObjetivo.nombre);
            } else {
                System.out.println("No hay aliados vivos, el aura solo afecta al " + this.nombre + ".");
            }
        }
    }
}
