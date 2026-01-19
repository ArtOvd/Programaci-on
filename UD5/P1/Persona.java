package P1;

public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
    }

    ;

    public Persona(String dni, String nombre, String apellido, int edad) {
        setDni(dni);
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprimirDatos() {
        System.out.println("DNI: " + getDni());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
    }

    public boolean esMayorDeEdad() {
        System.out.print("Es mayor de edad: ");
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esJubilado() {
        System.out.print("Es jubilado: ");
        if (edad >= 65) {
            return true;
        } else {
            return false;
        }
    }

    public int diferenciaEdad(Persona p) {
        return Math.abs(this.edad - p.getEdad());
    }
}
