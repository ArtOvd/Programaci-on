package StarWars;

public class Sith extends Maestro {
    private int fuerzaOscura;
    public Sith(String nombre, int vida,  int fuerzaOscura) {
        super(nombre, vida);
        setFuerzaOscura(fuerzaOscura);
    }

    public int getFuerzaOscura() {
        return fuerzaOscura;
    }

    public void setFuerzaOscura(int fuerzaOscura) {
        this.fuerzaOscura = fuerzaOscura;
    }

    @Override
    public String toString() {
        return super.toString() + "Fuerza Oscura: " + getFuerzaOscura();
    }

    @Override
    public void atacar(Maestro defensor) {
        if (this.vida == 1) {
            return;
        }
        int dano = this.fuerzaOscura;
        if (defensor instanceof Jedi j) {
            j.setFuerzaLuz(j.getFuerzaLuz() - 1);
        }
        System.out.println(this.nombre + " ataca a " + defensor.nombre + ". Le quita " + dano + " puntos de vida y 1 de fuerza.");

        defensor.recibirDano(dano);
    }

}
