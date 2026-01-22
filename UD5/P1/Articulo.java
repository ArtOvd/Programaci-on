package P1;

public class Articulo {
    private String nombre;
    private double precio;
    private final double iva = 0.21;
    private final double ivaReducido = 0.10;
    private final double ivaMinima = 0.04;
    private int stock;
    private String categoria;

    public Articulo(String nombre, double precio, int stock) {
        if (nombre == null || precio < 0 || stock < 0) {
            System.out.println("ERROR. DATOS NO VALIDOS");
        } else {
            setNombre(nombre);
            setPrecio(precio);
            setStock(stock);
            setCategoria(categoria);
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
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio sin IVA: " + precio);
    }

    public void getPVP() {
        if (categoria.equals("Hosteleria")) {
            System.out.println("PVP: " + (precio + (precio * ivaReducido)));
        } else if (categoria.equals("Medicamentos")) {
            System.out.println("PVP: " + (precio + (precio * ivaMinima)));
        } else {
            System.out.println("PVP: " + (precio + (precio * iva)));
        }
    }

    public void getPVPDescuento(int descuento) {
        if (categoria.equals("Hosteleria")) {
            System.out.println("PVP con descuento: " + ((precio + (precio * ivaReducido)) - ((precio + (precio * ivaReducido)) *  descuento / 100)));
        } else if (categoria.equals("Medicamentos")) {
            System.out.println("PVP con descuento: " + ((precio + (precio * ivaMinima)) - ((precio + (precio * ivaMinima)) *  descuento / 100)));
        } else {
            System.out.println("PVP con descuento: " + ((precio + (precio * iva)) - ((precio + (precio * iva)) *  descuento / 100)));
        }
    }

    public boolean vender(int cantidad) {
        if ((this.stock - cantidad) > 0) {
            stock -= cantidad;
            System.out.println("Venta realizada. Cantidad restante: " + stock);
            return true;
        } else {
            System.out.println("Venta no realizada. No hay esos artículos en el stock.");
            return false;
        }
    }

    public boolean almacenar(int cantidad) {
        if ((this.stock + cantidad) <= 100) {
            stock += cantidad;
            System.out.println("Almacenando. Cantidad actual: " + stock);
            return true;
        } else {
            System.out.println("Almacén completo.");
            return false;
        }
    }
}
