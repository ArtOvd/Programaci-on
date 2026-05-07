package EldenRing;

public class MainER {

    public static void main(String[] args) {
        InventarioMaestro im1 = new InventarioMaestro();
        im1.registrarArma("a01", new Arma("Espada", 10, 0.1));

        im1.eliminarArma("a01");
    }
}
