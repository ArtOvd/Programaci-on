package P1;

public class MainArticulo {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("Pijama", 10.0, 2);
        articulo1.mostrarDatos();
        articulo1.getPVP();
        System.out.println("MODIFICADO ");
        articulo1.setNombre("Camiseta");
        articulo1.setPrecio(15);
        articulo1.mostrarDatos();
        articulo1.getPVP();
        articulo1.getPVPDescuento(15);
        System.out.println(articulo1.vender(3));
        System.out.println(articulo1.almacenar(15));
    }
}
