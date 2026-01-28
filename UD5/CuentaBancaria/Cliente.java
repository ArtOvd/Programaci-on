package CuentaBancaria;

public class Cliente {
    private String nombre;
    private String apellido;
    private String direccion;
    private String localidad;
    static Cuenta[] cuentas = new Cuenta[5];

    public Cliente(String nombre, String apellido, String direccion, String localidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getLocalidad() {
        return localidad;
    }

    public void setNombre(String nombre) {
        if (nombre != null && nombre.length() >= 2) {
            this.nombre = nombre;
        } else {
            this.nombre = null;
        }
    }
    public void setApellido(String apellido) {
        if (apellido != null && apellido.length() >= 3) {
            this.apellido = apellido;
        } else {
            this.apellido = null;
        }
    }
    public void setDireccion(String direccion) {
        if (direccion != null && direccion.length() >= 8) {
            this.direccion = direccion;
        } else {
            this.direccion = null;
        }
    }
    public void setLocalidad(String localidad) {
        if (localidad != null && localidad.length() >= 3) {
            this.localidad = localidad;
        } else {
            this.localidad = null;
        }

    }
}
