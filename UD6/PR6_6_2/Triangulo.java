package PR6_6_2;

public class Triangulo extends Figura implements IFigura2D {
    private double base;
    private double altura;
    public Triangulo(int x, int y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public String toString() {
        return "Triángulo en (" + x + ", " + y + "), base=" + base + ", altura=" + altura + "\nArea de Triangulo: " + calcularArea();
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
