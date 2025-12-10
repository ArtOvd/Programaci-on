package P2;

import java.util.Scanner;

public class UD4P2E2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[5];
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Introduce un nombre: ");
            nombres[i] = sc.nextLine();
        }
        System.out.print("Introduce el nombre a buscar: ");
        String nombreABuscar = sc.nextLine();
        for (int j = 0; j < nombres.length; j++) {
            if (nombreABuscar.equals(nombres[j])) {
                System.out.println("El nombre si que esta en la lista");
            } else {
                System.out.println("El nombre no esta en la lista");
            }
            break;
        }
    }

}
