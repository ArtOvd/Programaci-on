package MiniRPG;

import PR6_1.Persona;

import java.util.ArrayList;

public class HechiceroOscuro extends Mago implements ISupport {
    public HechiceroOscuro(String nombre, int vida, int ataqueBase, int nivel, int mana) {
        super(nombre, vida, ataqueBase, nivel, mana);
    }

    @Override
    public void habilidadEspecial(Personaje enemigo) {
        if (this.mana >= 10) {
                int vidaAntesAtaque = enemigo.vida;
                int danyo = enemigo.recibirDano((ataqueBase + nivel) * 3);
                if (danyo > 0 && enemigo.estaVivo()) {
                    int roba = enemigo.recibirDano(5);
                    vida += roba;
                    System.out.println(getClass().getSimpleName()+ " " + this.nombre + " roba " + roba + " puntos de vida de " + enemigo.getClass().getSimpleName() + " " + enemigo.nombre);
                }
                this.mana -= 10;
        } else {
            System.out.println("No hay mana para habilidad especial.");
        }
    }

    @Override
    public void habilidadBuff(ArrayList<Personaje> aliados) {
        for (Personaje aliado : aliados) {
            if (!aliado.equals(this) && aliado.estaVivo() && ((aliado.vida - 3) > 0)) {
                aliado.ataqueBase += 7;
                aliado.vida -= 3;
            }
        }
        System.out.println("HechiceroOscuro activa FURIA: +7 ataque, -3 vida a sus aliados");
    }
}
