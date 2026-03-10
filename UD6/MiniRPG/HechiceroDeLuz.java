package MiniRPG;

public class HechiceroDeLuz extends Mago{
    public HechiceroDeLuz(String nombre, int vida, int ataqueBase, int nivel, int mana) {
        super(nombre, vida, ataqueBase, nivel, mana);
    }

    @Override
    public void habilidadEspecial(Personaje enemigo) {
        if (this.mana >= 6) {
            if (enemigo.estaVivo()) {
                System.out.println(getClass().getSimpleName() + " " + this.nombre + " ataca a " + enemigo.getClass().getSimpleName() + " " + enemigo.nombre);
                if (enemigo instanceof HechiceroOscuro) {
                    enemigo.recibirDano((ataqueBase + nivel) * 4);
                } else {
                    enemigo.recibirDano((ataqueBase + nivel) * 2);
                }
                System.out.println(enemigo.getClass().getSimpleName() + " " + enemigo.nombre + " ahora tiene " + enemigo.vida + " HP");
                this.mana -= 6;
            }
        } else {
            System.out.println("No hay mana");
        }
    }
}
