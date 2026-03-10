package MiniRPG;

public abstract class Personaje {
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
        System.out.println(getClass().getSimpleName() + " " +  this.nombre + " ataca a " + enemigo.getClass().getSimpleName() + " " + enemigo.nombre);
        enemigo.recibirDano(ataqueBase);
        System.out.println(enemigo.getClass().getSimpleName() + " " + enemigo.nombre + " ahora tiene " + enemigo.vida + " HP");
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
        return "· Clase: " + this.getClass().getSimpleName() + "\n· Nombre: " + this.nombre + "\n· Vida restante: " + this.vida + "\n· Ataque base: " + this.ataqueBase + "\n· Nivel: " + this.nivel;
    }

}
