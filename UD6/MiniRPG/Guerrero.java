package MiniRPG;

public abstract class Guerrero extends Personaje{
    public Guerrero(String nombre, int vida, int ataqueBase, int nivel){
        super(nombre, vida, ataqueBase, nivel);
    }

    public void atacar(Personaje enemigo) {
        System.out.println(getClass().getSimpleName() + " " +  this.nombre + " ataca a " + enemigo.getClass().getSimpleName() + " " + enemigo.nombre);
        enemigo.recibirDano(this.ataqueBase + (this.nivel * 2));
        System.out.println(enemigo.getClass().getSimpleName() + " " + enemigo.nombre + " ahora tiene " + enemigo.vida + " HP");

    }


}
