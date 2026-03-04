package MiniRPG;

public class Personaje {
    protected String nombre;
    protected int vida;
    protected int ataqueBase;
    protected int nivel;

    public Personaje(String nombre, int vida, int ataqueBase, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataqueBase = ataqueBase;
        this.nivel = nivel;
    }

    public void atacar(Personaje enemigo) {
        enemigo.recibirDano(ataqueBase);
    }

    public void recibirDano(int cantidad) {
        if ((vida - cantidad) < 0) {
            this.vida = 0;
        } else {
            this.vida -= cantidad;
        }
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public String toString() {
        return "Nombre: " + this.nombre + " | " + "Vida restante: " + this.vida + " | " + "Ataque base: " + this.ataqueBase + " | " + "Nivel: " + this.nivel;
    }

}
