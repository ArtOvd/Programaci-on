package PR6_5;

public class Satelite extends Astro{
    private int distanciaPlaneta;

    public Satelite(String nombre, int masa, double tmpMedia, int distanciaPlaneta) {
        super(nombre, masa, tmpMedia);
        setDistanciaPlaneta(distanciaPlaneta);
    }

    public int getDistanciaPlaneta() {
        return distanciaPlaneta;
    }

    public void setDistanciaPlaneta(int distanciaPlaneta) {
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public String toString(){
        return super.toString() + getDistanciaPlaneta();
    }
}
