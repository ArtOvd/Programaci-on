package P1;

public class Persona {
    final String dni;
    private String nombre;
    private String apellido;
    private int edad;
    static final int mayoriaEdad = 18;

    public Persona(String dni, String nombre, String apellido, int edad) {
        if (comprobarDNI(dni)) {
            this.dni = dni;
        }  else {
            this.dni = null;
        }
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
    }

    public String getDni() {
        return dni;
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
        if (edad >= mayoriaEdad) {
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

    public boolean comprobarDNI(String dni){
        boolean letra = false;
        if (dni.length() == 9) {
            if (dni.charAt(8) >= 'A' || dni.charAt(8) <= 'Z') {
                letra = true;
            }
            int contador = 0;
            for (int i = 0; i < dni.length() - 1; i++) {
                if (dni.charAt(i) >= '0' && dni.charAt(i) <= '9') {
                    contador++;
                }
            }
            if (contador == 8 && letra) {
                return true;
            }
        }
        return false;
    }
}
