package MiniRPG;

public class Caballero extends Guerrero{
    public Caballero(String nombre, int vida, int ataqueBase, int nivel){
        super(nombre, vida, ataqueBase, nivel);
        this.vida += 20;
    }

    @Override
    public int recibirDano(int dano){
        //int danoReducido = (int) (dano * 0.7);
        return super.recibirDano((int) (dano * 0.7));
    }

}
