package PR6_4;

public class Canario extends Mascota{
    private boolean volando;

    public Canario(String nombre, int edad, boolean volando) {
        super(nombre, edad);
        setVolando(volando);
    }

    public boolean isVolando() {
        return volando;
    }

    public void setVolando(boolean volando) {
        this.volando = volando;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Volando: " + isVolando();
    }

    @Override
    public void habla() {
        System.out.println(getClass().getSimpleName() + ": Pio Pio");
    }

    @Override
    public void cumpleaños() {
        edad = edad + 2;
    }
}
