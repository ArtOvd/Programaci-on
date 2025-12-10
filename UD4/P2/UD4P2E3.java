package P2;

import java.util.Scanner;

public class UD4P2E3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[8];
        int contador = 0;
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Introduce el nombre: ");
            nombres[i] = sc.nextLine().toLowerCase();
        }

        System.out.print("Introduce una letra: ");
        char letra = sc.next().toLowerCase().charAt(0);

        for (int j = 0; j < nombres.length; j++) {
            if (letra == nombres[j].charAt(0)) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " nombres que empizan por " + letra);
    }

}
