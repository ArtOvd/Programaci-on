package P1;

public class Articulo {
    private String nombre;
    private double precio;
    private double iva = 0.21;
    private int stock;

    public Articulo() {};

    public Articulo(String nombre, double precio, int stock) {
        if (nombre == null || precio < 0 || stock < 0) {
            System.out.println("ERROR. DATOS NO VALIDOS");
        } else {
            setNombre(nombre);
            setPrecio(precio);
            setStock(stock);
        }
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio sin IVA: " + precio);
    }

    public void calcularPVP() {
        System.out.println("PVP: " + (precio + (precio * iva)));
    }
}
