package P1;

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
        int x1 = this.x;
        int y1 = this.y;
        int cat1 = x1 -  p.getX();
        int cat2 = y1 - p.getY();
        double suma = ((cat1 * cat1) + (cat2 * cat2));
        double gip = Math.sqrt(suma);
        return (int) gip;
    }
}
