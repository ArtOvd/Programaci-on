package MiniRPG;

public class Bardo extends Arquero {
    public Bardo(String nombre, int vida, int ataqueBase, int nivel) {
        super(nombre, vida, ataqueBase, nivel);
    }

    @Override
    public void recibirDano(int dano){
        double blockChance = Math.random();
        if (blockChance <= 0.3) {
            System.out.println(this.nombre + "esquivó el ataque!");
        } else {
            super.recibirDano(dano);
        }

    }
}
