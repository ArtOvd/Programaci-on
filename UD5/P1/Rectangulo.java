package P1;

import java.util.Random;

public class Rectangulo {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    static final int min = 0;
    static final int max = 100;

    public Rectangulo() {};

    public Rectangulo(int x1, int y1, int x2, int y2) {
        if (x2 < x1 && y2 < y1) {
            System.out.println("ERROR. DATOS NO VALIDOS");
        } else {
            setX1(x1);
            setY1(y1);
            setX2(x2);
            setY2(y2);
        }
    }

    public int getX1() {
        return x1;
    }
    public int getY1() {
        return y1;
    }
    public int getX2() {
        return x2;
    }
    public int getY2() {
        return y2;
    }

    public void setX1(int x1) {
        if (x1 >= min && x1 <= max && x1 < x2) {
            this.x1 = x1;
        }
    }
    public void setY1(int y1) {
        if (y1 >= min && y1 <= max && y1 < y2) {
            this.y1 = y1;
        }
    }
    public void setX2(int x2) {
        if (x2 >= 0 && x2 <= max && x2 > x1) {
            this.x2 = x2;
        }
    }
    public void setY2(int y2) {
        if (y2 >= 0 && y2 <= max && y2 > y1) {
            this.y2 = y2;
        }
    }

    public void mostrarRectangulo() {
        System.out.println("X1: " + getX1());
        System.out.println("Y1: " + getY1());
        System.out.println("X2: " + getX2());
        System.out.println("Y2: " + getY2());
    }

    public int calcularPerimetro() {
        return (Math.abs(getX1() - getX2()) +  Math.abs(getY1() - getY2())) * 2;
    }

    public int calcularArea() {
        return Math.abs(getX1() - getX2()) *  Math.abs(getY1() - getY2()) ;
    }

    public void setterDoble1(int x1, int y1) {
        setX1(x1);
        setY1(y1);
    }

    public void setterDoble2(int x2, int y2) {
        setX2(x2);
        setY2(y2);
    }

    public void setAll(int x1, int y1, int x2, int y2) {
        setterDoble1(x1, y1);
        setterDoble2(x2, y2);
    }

    public void crearRectanguloAleatorio() {
        int x1 = new Random().nextInt(min, max);
        int y1 = new Random().nextInt(min, max);
        int x2 = new Random().nextInt(min, max);
        int y2 = new Random().nextInt(min, max);
        setAll(x1, y1, x2, y2);
    }
}
