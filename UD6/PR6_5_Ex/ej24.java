package PR6_5_Ex;

import java.util.ArrayList;
import java.util.Scanner;

public class ej24 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Gato> gatos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            while (true) {
                try {
                    System.out.println("Introduce el nombre del gato: ");
                    String n = sc.nextLine();
                    System.out.println("Introduce la edad del gato: ");
                    int edad = sc.nextInt();
                    sc.nextLine();
                    gatos.add(new Gato(n, edad));
                    System.out.println();
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        for (Gato gato : gatos) {
            gato.imprimir();
        }
    }

}
