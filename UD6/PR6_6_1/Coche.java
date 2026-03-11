package PR6_6_1;

public class Coche implements IEncendible {
    int km;
    int asientos;
    public Coche(int km, int asientos) {
        this.km = km;
        this.asientos = asientos;
    }

    @Override
    public void encender() {
        System.out.println("El coche arranca.");
    }

    @Override
    public void apagar() {
        System.out.println("El coche se para.");
    }
}
