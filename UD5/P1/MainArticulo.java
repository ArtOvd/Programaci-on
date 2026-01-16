package P1;

public class MainArticulo {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("Pijama", 10.0, 5);
        articulo1.mostrarDatos();
        articulo1.calcularPVP();
        System.out.println("MODIFICADO ");
        articulo1.setNombre("Camiseta");
        articulo1.setPrecio(15);
        articulo1.mostrarDatos();
        articulo1.calcularPVP();
    }
}
