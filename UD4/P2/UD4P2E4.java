package P2;

import java.util.Scanner;

public class UD4P2E4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[6];
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Introduce el nombre: ");
            nombres[i] = sc.nextLine().toLowerCase();
        }
        int min = 0;
        int max = 0;
        for (int j = 0; j < nombres.length; j++) {
            if (nombres[min].length() < nombres[j].length()) {
                min = j;
            }
            if (nombres[max].length() > nombres[j].length()) {
                max = j;
            }
        }
        System.out.println("El nombre más largo es " + nombres[max] + " (" + nombres[max].length() + " caracteres)");
        System.out.println("El nombre más corto es " + nombres[min] + " (" + nombres[min].length() + " caracteres)");
    }

}
