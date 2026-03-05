package PR6_4;

public abstract class Mascota {
    protected String nombre;
    protected int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    };

    public abstract String toString() ;

    public abstract void habla();

    public void cumpleaños() {
        edad++;
    };


}
