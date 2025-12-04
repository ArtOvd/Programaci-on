package P1;

import java.util.Scanner;

public class EjerciciosBasicosArrays {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // ejercicio1();
        // ejercicio2();
        // ejercicio3(sc);

        int[] notas = new int[5];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = i * 2;
        }
    }


    static void ejercicio1(Scanner sc) {
        int array[] = {0, 5, 4, 2, 5, 8, 11, 5, 1, 3};
        int contador = 0;
        System.out.println("Introduce el numero:");
            int entrada = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (entrada == array[i]) {
                contador++;
            }
        }
        System.out.println("El numero aparece " + contador + " veces.");
    }

    static void ejercicio2() {
        String array[] = {"java", "sigma", "sus", "sysnik"};
        String largo = "";
        for (int i = 0; i < array.length; i++) {
            if (largo.length() < array[i].length()) {
                largo = array[i];
            }
        }
        System.out.println(largo);
    }

    static void ejercicio3(Scanner sc) {
        String array[] = {"java", "sigma", "sus", "sysnik"};
        System.out.print("Su letra: ");
        char letra = sc.next().charAt(0);
        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0) == letra) {
                System.out.println(array[i]);
            }
        }
    }
}
