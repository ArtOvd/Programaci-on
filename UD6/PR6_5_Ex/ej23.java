package PR6_5_Ex;

import java.io.IOException;

public class ej23 {
    public static void main(String[] args) throws Exception {
        try {
            Gato g1 = new Gato("Anton", 25);
            g1.imprimir();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Gato g2 = new Gato("", -5);
            g2.imprimir();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
