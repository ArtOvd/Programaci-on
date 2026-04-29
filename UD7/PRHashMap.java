import java.util.HashMap;

public class PRHashMap {

    public static void main(String[] args) {
        // EJ 1:
//        Map<String, String> palabras = new HashMap<>();
//        palabras.put("beer", "cerveza");
//        palabras.put("pear", "pera");
//        palabras.put("meat", "carne");
//        palabras.put("pen", "boli");
//        Scanner sc = new Scanner(System.in);
//        String cadena =  sc.nextLine().toLowerCase();
//        System.out.println(palabras.getOrDefault(cadena, "Palabra no encontrada."));

        // EJ 2:
//        Map<String, Integer> votos = new HashMap<>();
//        Scanner sc = new Scanner(System.in);
//        for  (int i = 1; i <= 10; i++) {
//            String voto = sc.nextLine();
//            if (votos.containsKey(voto)) {
//                votos.put(voto, votos.get(voto) + 1);
//            } else {
//                votos.put(voto, 1);
//            }
//        }
//        System.out.println(votos);

        // EJ 3:
        class GestorStock {
            HashMap<String, Producto> stock = new HashMap<>();
            public void addProducto(String nombre, double precio, int cantidad) {
                stock.put(nombre, new Producto(nombre, precio, cantidad));
            }

            public void removeProducto(Producto p) {
                stock.remove(p.getNombre());
            }

            public void aumentarStock(Producto p,  int cantidad) {
                p.setCantidad(cantidad);
                stock.put(p.getNombre(), p);
            }

            class Producto {
                private String nombre;
                private double precio;
                private int cantidad;
                public Producto(String nombre, double precio, int stock) {
                    setNombre(nombre);
                    setPrecio(precio);
                    setCantidad(stock);
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
                public int getCantidad() {
                    return cantidad;
                }
                public void setCantidad(int cantidad) {
                    this.cantidad = cantidad;
                }
            }

        }

        GestorStock gs = new GestorStock();



    }

}
