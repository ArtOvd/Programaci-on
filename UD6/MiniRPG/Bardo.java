package MiniRPG;

public class Bardo extends Arquero implements IEvasion {
    public Bardo(String nombre, int vida, int ataqueBase, int nivel) {
        super(nombre, vida, ataqueBase, nivel);
    }

    @Override
    public int recibirDano(int dano){
       if (evadeAtaqueNormal()) {
           System.out.println(this.getClass().getSimpleName() + " " + this.nombre + " esquiva el ataque por agilidad!");
           return 0;
       } else {
           super.recibirDano(dano);
       }
       return dano;
    }

    @Override
    public boolean evadeAtaqueNormal() {
        return Math.random() <= 0.4;
    }
}
