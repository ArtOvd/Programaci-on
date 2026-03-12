package MiniRPG;

public class Caballero extends Guerrero implements IEvasion {
    public Caballero(String nombre, int vida, int ataqueBase, int nivel){
        super(nombre, vida, ataqueBase, nivel);
        this.vida += 20;
    }

    @Override
    public int recibirDano(int dano){
        if (evadeAtaqueNormal()) {
            System.out.println(this.getClass().getSimpleName() + " " + this.nombre + " bloquea el ataque con escudo!");
            return 0;
        } else {
            return super.recibirDano((int) (dano * 0.7));
        }
    }

    @Override
    public boolean evadeAtaqueNormal() {
        return Math.random() <= 0.3;
    }

}
