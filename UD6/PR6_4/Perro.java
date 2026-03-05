package PR6_4;

public class Perro extends Mascota {
    private boolean pulgas;

    public Perro(String nombre, int edad, boolean pulgas) {
        super(nombre, edad);
        setPulgas(pulgas);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Pulgas: " + getPulgas();
    }

    @Override
    public void habla() {
        System.out.println(getClass().getSimpleName() + ": Guau Guau");
    }

    public boolean getPulgas() {
        return this.pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }

    public void cumpleaños() {
        super.cumpleaños();
    }
}
