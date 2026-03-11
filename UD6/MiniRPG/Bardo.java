package MiniRPG;

public class Bardo extends Arquero {
    public Bardo(String nombre, int vida, int ataqueBase, int nivel) {
        super(nombre, vida, ataqueBase, nivel);
    }

    @Override
    public int recibirDano(int dano){
        double blockChance = Math.random();
        if (blockChance <= 0.3) {
            System.out.println(this.getClass().getSimpleName() + " " + this.nombre + " esquivó el ataque!");
            return 0;
        } else {
            return super.recibirDano(dano);
        }

    }
}
