package EldenRing;

public class Arma {
    private String nombre;
    private int ataque;
    private double durabilidad;

    public  Arma(String nombre, int ataque, double durabilidad) {
        setNombre(nombre);
        setAtaque(ataque);
        setDurabilidad(durabilidad);
    }


    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(double durabilidad) {
        this.durabilidad = durabilidad;
    }
}
