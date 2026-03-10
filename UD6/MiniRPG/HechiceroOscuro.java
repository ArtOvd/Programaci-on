package MiniRPG;

public class HechiceroOscuro extends Mago {
    public HechiceroOscuro(String nombre, int vida, int ataqueBase, int nivel, int mana) {
        super(nombre, vida, ataqueBase, nivel, mana);
    }

    @Override
    public void habilidadEspecial(Personaje enemigo) {
        if (this.mana >= 10) {
            if (enemigo.estaVivo()) {
                int vidaAntesAtaque = enemigo.vida;
                System.out.println(getClass().getSimpleName() + " " + this.nombre + " ataca a " + enemigo.getClass().getSimpleName() + " " + enemigo.nombre);
                enemigo.recibirDano((ataqueBase + nivel) * 3);
                if (enemigo.estaVivo() && vidaAntesAtaque > enemigo.vida ) {
                    this.vida += 5;
                    System.out.println(getClass().getSimpleName()+ " " + this.nombre + " roba 5 puntos de vida de " + enemigo.getClass().getSimpleName() + " " + enemigo.nombre);
                    enemigo.recibirDano(5);
                }
                System.out.println(enemigo.getClass().getSimpleName() + " " + enemigo.nombre + " ahora tiene " + enemigo.vida + " HP");
                this.mana -= 10;
            }
        } else {
            System.out.println("No hay mana para atacar.");
        }
    }

}
