package PR6_6_2;

public class Cubo extends Figura implements IFigura3D {
    private double lado;
    public Cubo(int x, int y, double lado) {
        super(x, y);
        this.lado = lado;
    }
    @Override
    public String toString() {
        return "Cubo en (" + x + ", " + y + "), lado=" + lado + "\nVolumen del cubo: " + calcularVolumen();
    }

    @Override
    public double calcularVolumen() {
        return  lado * lado * lado;
    }
}
