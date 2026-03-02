package PR6_2;

public class Circulo extends Figura {
    private double radio;
    Circulo(double radio) {
        setRadio(radio);
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public double area() {
        return Math.PI * getRadio() * getRadio();
    }

}
