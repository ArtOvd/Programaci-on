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
        System.out.println(getClass().getSimpleName() + " " +  this.nombre + " ataca a " + enemigo.getClass().getSimpleName() + " " + enemigo.nombre);
        enemigo.recibirDano(ataqueBase + nivel);
        System.out.println(enemigo.getClass().getSimpleName() + " " + enemigo.nombre + " ahora tiene " + enemigo.vida + " HP");
    }

    @Override
    public String toString() {
        return super.toString() + "\n· Mana: " + this.mana;
    }
}
