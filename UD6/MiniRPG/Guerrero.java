package MiniRPG;

public class Guerrero extends Personaje{
    public Guerrero(String nombre, int vida, int ataqueBase, int nivel){
        super(nombre, vida, ataqueBase, nivel);
    }

    public void atacar(Personaje enemigo) {
        enemigo.recibirDano(this.ataqueBase + (this.nivel * 2));
    }


}
