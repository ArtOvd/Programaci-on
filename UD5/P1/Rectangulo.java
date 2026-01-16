package P1;

public class Rectangulo {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangulo() {};

    public Rectangulo(int x1, int y1, int x2, int y2) {
        if (x1 < 0 || y1 < 0 || x2 < 0 || y2 < 0) {
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
        this.x1 = x1;
    }
    public void setY1(int y1) {
        this.y1 = y1;
    }
    public void setX2(int x2) {
        this.x2 = x2;
    }
    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void mostrarRecangulo() {
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
}
