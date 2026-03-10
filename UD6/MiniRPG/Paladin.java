package MiniRPG;

public class Paladin extends Guerrero {
    public Paladin(String nombre, int vida, int ataqueBase, int nivel) {
        super(nombre, vida, ataqueBase, nivel);
    }

    @Override
    public void atacar(Personaje enemigo) {
        int ataque = (int) (ataqueBase + (nivel * 1.5));
        System.out.println(getClass().getSimpleName() + " " +  this.nombre + " ataca a " + enemigo.getClass().getSimpleName() + " " + enemigo.nombre);
        enemigo.recibirDano(ataque);
        System.out.println(enemigo.getClass().getSimpleName() + " " + enemigo.nombre + " ahora tiene " + enemigo.vida + " HP");
    }
}
