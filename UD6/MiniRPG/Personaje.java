package MiniRPG;

public abstract class Personaje {
    protected String nombre;
    protected int vida;
    protected int ataqueBase;
    protected int nivel;
    protected int vidaMax;

    public Personaje(String nombre, int vida, int ataqueBase, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataqueBase = ataqueBase;
        this.nivel = nivel;
        this.vidaMax = this.vida;
    }

    public abstract void atacar(Personaje enemigo);

    public int recibirDano(int cantidad) {
        int danyo = Math.min(vida, cantidad);
        vida -= danyo;
        return danyo;
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public String toString() {
        return "· Clase: " + this.getClass().getSimpleName() + "\n· Nombre: " + this.nombre + "\n· Vida restante: " + this.vida + "\n· Ataque base: " + this.ataqueBase + "\n· Nivel: " + this.nivel;
    }

}
