package StarWars;

public class Jedi extends Maestro {
    private int fuerzaLuz;
    public Jedi(String nombre, int vida, int fuerzaLuz) {
        super(nombre, vida);
        setFuerzaLuz(fuerzaLuz);
    }

    public int getFuerzaLuz() {
        return fuerzaLuz;
    }

    public void setFuerzaLuz(int fuerzaLuz) {
        this.fuerzaLuz = fuerzaLuz;
    }

    @Override
    public String toString(){
        return super.toString() + "Fuerza Luz: " + getFuerzaLuz();
    }
    @Override
    public void atacar(Maestro defensor) {
        if (this.vida == 1) {
            return;
        }
        int dano;
        if (this.vida < 10) {
            dano = this.fuerzaLuz * 3;
            System.out.println(this.nombre + " ataca a " + defensor.nombre + ". Le quita " + dano + " de vida (daño triple)");
        } else {
            dano = this.fuerzaLuz;
            System.out.println(this.nombre + " ataca a " + defensor.nombre + ". Le quita " + dano + " de vida.");
        }
        defensor.recibirDano(dano);
    }

}
