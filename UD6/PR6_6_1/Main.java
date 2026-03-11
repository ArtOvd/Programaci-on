package PR6_6_1;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<IEncendible> lista = new ArrayList<>();
        lista.add(new Lampara(300));
        lista.add(new Coche(20000, 4));
        lista.add(new Horno(400));
        for (IEncendible i : lista) {
            i.encender();
            i.apagar();
            System.out.println("=====");
        }
    }
}
