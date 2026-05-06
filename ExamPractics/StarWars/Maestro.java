package StarWars;

public abstract class Maestro {
    protected String nombre;
    protected int vida;

    public Maestro(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + this.nombre + ". " + "Vida: " +  this.vida + ". ";
    }

    protected abstract void atacar(Maestro defensor);

    protected void recibirDano(int dano) {
        if (this.vida - dano <= 0) {
            this.vida = 1;
            System.out.println(this.nombre + " no puede atacar.");
        } else {
            this.vida -= dano;
        }
    }
}
