package MiniRPG;

public abstract class Mago extends Personaje{
    protected int mana;

    public Mago(String nombre, int vida, int ataqueBase, int nivel, int mana){
        super(nombre, vida, ataqueBase, nivel);
        this.mana = mana;
    }

    public abstract void habilidadEspecial(Personaje enemigo);

    @Override
    public void atacar(Personaje enemigo) {
        enemigo.recibirDano(ataqueBase + nivel);
    }

    @Override
    public String toString() {
        return super.toString() + "\n· Mana: " + this.mana;
    }
}
