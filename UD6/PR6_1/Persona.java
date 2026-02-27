package PR6_1;

import java.util.ArrayList;

public class Persona {
    protected String nombre;
    protected String apellidos;
    protected String fechaNacim;
    public Persona(String n, String a, String f) {
        setNombre(n);
        setApellidos(a);
        setFechaNacim(f);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacim() {
        return fechaNacim;
    }

    public void setFechaNacim(String fechaNacim) {
        this.fechaNacim = fechaNacim;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String toString() {
        return nombre + " " + apellidos + " " + fechaNacim;
    }

}
