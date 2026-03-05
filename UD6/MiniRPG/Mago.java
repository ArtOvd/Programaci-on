package MiniRPG;

public class Mago extends Personaje{
    protected int mana;

    public Mago(String nombre, int vida, int ataqueBase, int nivel, int mana){
        super(nombre, vida, ataqueBase, nivel);
        this.mana = mana;
    }

    public void habilidadEspecial(Personaje enemigo){
        if (enemigo.estaVivo()) {
            if ((this.mana - 10) >= 0) {
                atacar(enemigo);
                atacar(enemigo);
                this.mana -= 10;
            }
        }
    }

    @Override
    public void atacar(Personaje enemigo) {
        enemigo.recibirDano(ataqueBase + nivel);
    }
}
