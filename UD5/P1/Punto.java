package P1;

import java.util.Random;

public class Punto {
    private int x;
    private int y;

    public Punto() {};

    public Punto(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void mostrarDatos() {
        System.out.println("Punto: " + getX() + " " + getY());
    }

    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }

    public void desplazar(int dx, int dy) {
        setX(x + dx);
        setY(y + dy);
    }

    public int calcularDistancia(Punto p) {
        int cat1 = Math.abs(this.x -  p.getX());
        int cat2 = Math.abs(this.y - p.getY());
        double suma = ((cat1 * cat1) + (cat2 * cat2));
        double distancia = Math.sqrt(suma);
        return (int) distancia;
    }

    public static Punto crearPuntoAleatorio() {
        int x = new Random().nextInt(-100, 100);
        int y = new Random().nextInt(-100, 100);
        return new Punto(x, y);
    }
}
