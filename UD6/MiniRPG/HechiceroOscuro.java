package MiniRPG;

public class HechiceroOscuro extends Mago{
    public HechiceroOscuro(String nombre, int vida, int ataqueBase, int nivel, int mana){
        super(nombre, vida, ataqueBase, nivel, mana);
    }

    @Override
    public void habilidadEspecial(Personaje enemigo) {
        if (this.mana >= 10) {
            if (enemigo.estaVivo()) {
                enemigo.recibirDano((ataqueBase + nivel) * 3);
                if (enemigo.estaVivo()) {
                    this.vida += 5;
                enemigo.recibirDano(5);
                }
                this.mana -= 10;
            }
        } else {
            System.out.println("No hay mana");
        }
    }

}
