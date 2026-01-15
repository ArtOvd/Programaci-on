package P1;

public class Persona {
    public String dni;
    public String nombre;
    public String apellido;
    public int edad;

    public Persona() {};

    public Persona(String dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void imprimirDatos() {
        System.out.print(nombre + " " + apellido + " con DNI: " + dni + " ");
    }

    public void esMayorDeEdad() {
        if  (edad >= 18) {
            System.out.println("es mayor de edad.");
        } else {
            System.out.println("no es mayor de edad.");
        }
    }
}
