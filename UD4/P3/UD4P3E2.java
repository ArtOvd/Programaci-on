package P3;

import java.util.Scanner;

public class UD4P3E2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[][] matriz = tablasMultiplicar(n);
        imprimirMatriz(matriz);
        System.out.println("Valor A: ");
        int a = sc.nextInt();
        System.out.println("Valor B: ");
        int b = sc.nextInt();
        int res = valorTabla(matriz, a, b);
        System.out.println("Valor en tabla (" + a + " * " + b + ") = " + res);
    }

    static int[][] tablasMultiplicar(int n) {
        int m[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = (i + 1) * (j + 1);
            }
        }
        return m;
    }

    static void imprimirMatriz(int[][] matriz) {
        System.out.print("X | ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n--|---------------------------------");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int valorTabla(int[][] m, int a, int b) {
        return m[a - 1][b - 1];
    }
}
