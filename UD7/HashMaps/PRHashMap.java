package HashMaps;

import java.util.HashMap;

public class PRHashMap {

    public static void main(String[] args) {
        GestorStock gs = new GestorStock();
        gs.addProducto("m1", "Manzana", 2.0, 500);
        System.out.println(gs.stock);
    }

}
