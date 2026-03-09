package MiniRPG;

public abstract class Arquero extends Personaje{
    public Arquero (String nombre, int vida, int ataqueBase, int nivel) {
        super(nombre, vida, ataqueBase, nivel);
    }

    public void atacar(Personaje enemigo) {
        enemigo.recibirDano(this.ataqueBase + (this.nivel * 3));
    }
}
