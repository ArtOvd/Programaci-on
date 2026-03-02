package PR6_2;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        setLado(lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    @Override
    public double area() {
        return getLado() * getLado();
    }
}
