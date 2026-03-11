package MiniRPG;

public class HechiceroDeLuz extends Mago{
    public HechiceroDeLuz(String nombre, int vida, int ataqueBase, int nivel, int mana) {
        super(nombre, vida, ataqueBase, nivel, mana);
    }

    @Override
    public void habilidadEspecial(Personaje enemigo) {
        if (this.mana >= 6) {
                if (enemigo instanceof HechiceroOscuro) {
                    enemigo.recibirDano((ataqueBase + nivel) * 4);
                } else {
                    enemigo.recibirDano((ataqueBase + nivel) * 2);
                }
                this.mana -= 6;
        } else {
            System.out.println("No hay mana para atacar.");
        }
    }
}
