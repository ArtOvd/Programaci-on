package MiniRPG;

public class Paladin extends Guerrero {
    public Paladin(String nombre, int vida, int ataqueBase, int nivel) {
        super(nombre, vida, ataqueBase, nivel);
    }

    @Override
    public void atacar(Personaje enemigo) {
        int ataque = (int) (ataqueBase + (nivel * 1.5));
        enemigo.recibirDano(ataque);
    }
}
