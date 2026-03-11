package PR6_6_2;

public class Figura {
    protected int x;
    protected int y;
    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "Figura en posición (" + x + ", " + y + ")";
    }
}
