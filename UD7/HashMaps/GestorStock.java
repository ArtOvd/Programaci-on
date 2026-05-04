package HashMaps;

import java.util.HashMap;

public class GestorStock {
    HashMap<String, Producto> stock = new HashMap<>();

    public void addProducto(String codigo, String nombre, double precio, int cantidad) {
        if (codigo.isEmpty() || nombre.isEmpty()) {
            throw new IllegalArgumentException("No se puede poner los datos vacíos.");
        }
        if (stock.containsKey(codigo)) {
            throw new IllegalArgumentException("El producto ya existe en el sistema.");
        }
        if (precio <= 0 || cantidad <= 0) {
            throw new IllegalArgumentException("La precio y/o la cantidad no pueden ser negativo.");
        }
        stock.put(codigo, new Producto(codigo, nombre, precio, cantidad));
    }

    public void removeProducto(String codigo) {
        if (!buscarProducto(codigo)) {
            throw new RuntimeException("No existe el producto con el codigo: " + codigo);
        }
        stock.remove(codigo);
    }

    public void aumentarStock(String codigo,  int cantidad) {
        Producto p = stock.get(codigo);
        if (!buscarProducto(codigo)) {
            throw new IllegalArgumentException("Producto no encontrado: " + codigo);
        }
        if (cantidad < 0) {
            throw new IllegalArgumentException("Cantidad negativa: " + cantidad);
        }
        p.setCantidad(p.getCantidad() + cantidad);
    }

    public void disminuirStock(String codigo, int cantidad) {
            Producto p = stock.get(codigo);
            if (!buscarProducto(codigo)) {
                throw new IllegalArgumentException("Producto no encontrado: " + codigo);
            }
            if (p.getCantidad() < cantidad) {
                throw new IllegalStateException("Stock insuficiente para: " + p.getNombre());
            }
            if (cantidad < 0) {
                throw new IllegalArgumentException("Cantidad negativa: " + cantidad);
            }
            p.setCantidad(p.getCantidad() - cantidad);
        }


    public boolean buscarProducto(String codigo) {
        if (stock.containsKey(codigo)) {
            System.out.println("Producto encontrado: " + codigo);
            return true;
        } else {
            return false;
        }
    }

    public void mostrarProductosCriticos() {
        stock.forEach((codigo, producto) -> {
            if (stock.get(codigo).getCantidad() < 3) {
                System.out.println(stock.get(codigo) + ": " +  stock.get(codigo).getNombre() + " - " + producto.getCantidad());
            }
        });
    }
}
