package P1;

import java.util.Scanner;

public class UD4P1E6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño: ");
        int n = sc.nextInt();
        int contador = 0;
        boolean[] valores = alternarBooleanos(n);
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i] + " ");
            if (valores[i] == true) {
                contador++;
            }
        }
        System.out.println("Trues: " + contador);

    }

    static boolean[] alternarBooleanos(int n) {
        boolean[] valores = new boolean[n];
        valores[0] = false;
        for (int i = 1; i < valores.length; i++) {
            if (valores[i - 1] == false) {
                valores[i] = true;
            } else {
                valores[i] = false;
            }
        }
        return valores;
    }

}
