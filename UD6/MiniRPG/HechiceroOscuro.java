package MiniRPG;

public class HechiceroOscuro extends Mago {
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

}
