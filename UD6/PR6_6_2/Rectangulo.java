package PR6_6_2;

public class Rectangulo extends Figura implements IFigura2D {
    private double ancho;
    private double alto;
    public Rectangulo(int x, int y, double ancho, double alto) {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Rectángulo en (" + x + ", " + y + "), ancho=" + ancho + ", alto=" + alto + "\nArea de rectángulo: " + calcularArea();
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
