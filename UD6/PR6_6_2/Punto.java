package PR6_6_2;

public class Punto extends Figura{
    public Punto(int x, int y) {
        super(x, y);
    }
    @Override
    public String toString() {
        return "Punto en (" + x + ", " + y + ")";
    }
}
