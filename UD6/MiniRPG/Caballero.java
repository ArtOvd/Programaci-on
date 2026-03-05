package MiniRPG;

public class Caballero extends Guerrero{
    public Caballero(String nombre, int vida, int ataqueBase, int nivel){
        super(nombre, vida, ataqueBase, nivel);
        this.vida += 20;
    }

    public void atacar(Personaje enemigo){
        super.atacar(enemigo);
        enemigo.recibirDano(5);
    }


}
