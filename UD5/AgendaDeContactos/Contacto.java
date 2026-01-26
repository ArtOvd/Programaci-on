package AgendaDeContactos;

public class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    public Contacto(String nombre, String telefono, String email) {
        setNombre(nombre);
        setTelefono(telefono);
        setEmail(email);
    }

    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setNombre(String nombre) {
        if (nombre != null && nombre.length() >= 10) {
            this.nombre = nombre;
        } else {
            this.nombre = null;
        }
    }
    public void setTelefono(String telefono) {
        if (telefono != null && telefono.length() == 9) {
            this.telefono = telefono;
        } else {
            this.telefono = null;
        }
    }
    public void setEmail(String email) {
        if (email != null && email.contains("@") &&  email.contains(".") && email.length() >= 10) {
            this.email = email;
        } else {
            this.email = null;
        }
    }

    public String toString() {
        return "Nombre: " + nombre + "\n" + "Teléfono: " + telefono + "\n"+ "Correo: " + email;
    }

    public void print() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Correo: " + email);
    }
}
