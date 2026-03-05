package MiniRPG;

public class HechiceroOscuro extends Mago{
    public HechiceroOscuro(String nombre, int vida, int ataqueBase, int nivel, int mana){
        super(nombre, vida, ataqueBase, nivel, mana);
    }



    @Override
    public void habilidadEspecial(Personaje enemigo) {
        if (enemigo.estaVivo()) {
            super.habilidadEspecial(enemigo);
            super.atacar(enemigo);
            if (enemigo.vida - 5 >= 0) {
                enemigo.recibirDano(5);
                this.vida += 5;
            }
        }
    }
}
