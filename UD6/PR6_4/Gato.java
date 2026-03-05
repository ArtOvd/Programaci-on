package PR6_4;

public class Gato extends Mascota {
    private String color;
    public Gato(String nombre, int edad, String color) {
        super(nombre, edad);
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Color: " + getColor();
    }

    @Override
    public void habla() {
        System.out.println(getClass().getSimpleName() + ": Miau Miau");
    }

    public void cumpleaños() {
        super.cumpleaños();
    }
}
