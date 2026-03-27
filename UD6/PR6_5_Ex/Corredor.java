package PR6_5_Ex;

public class Corredor {
    private int energia;
    public Corredor(int energia) {
        setEnergia(energia);
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void recargarEnergia(int e) {
        this.energia += e;
    }

    public void correr() throws AgotadoException {
        if (this.energia >= 10) {
            System.out.println("Corriendo...");
            this.energia -= 10;
            System.out.println("Cantidad actual de la energía: " + this.energia);
        } else {
            throw new AgotadoException("No hay energía suficiente.");
        }
    }
}
