package P2;

import java.util.Scanner;

public class UD4P2E6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] palabras = new String[10];
        String[] iguales = new String[10];
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Introduce una palabra: ");
            palabras[i] = sc.nextLine();
        }
        for (int i = 0; i < palabras.length; i++) {
            for (int j = i + 1; j < iguales.length; j++) {
                if (palabras[i].equals(palabras[j])) {
                    iguales[i] = palabras[j];
                }
            }
        }
        if (iguales[0] != null) {
            System.out.println("Sí hay palabras repetidas");
            System.out.print("Palabras repetidas: ");
            for (int i = 0; i < iguales.length; i++) {
                if (iguales[i] != null) {
                    System.out.print(" " + iguales[i] + ", ");
                }
            }
        } else {
            System.out.println("No hay palabras repetidas");
        }

    }

}
