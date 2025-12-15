package P3;

import java.util.Scanner;

public class UD4P3E3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Filas: ");
        int filas = sc.nextInt();
        System.out.print("Columnas: ");
        int columnas = sc.nextInt();
        int[][] matriz = leerMatriz(sc, filas, columnas);
        imprimirMatriz(matriz);
        int[] vectorF = sumaFilas(matriz);
        int[] vectorC = sumaColumnas(matriz);
        System.out.println("Suma de cada fila: ");
        imprimirVector(vectorF);
        System.out.println("Suma de cada columna: ");
        imprimirVector(vectorC);
    }

    static int[][] leerMatriz(Scanner sc, int f, int c) {
        int[][] matriz = new int[f][c];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("m[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

    static int[] sumaFilas(int[][] m) {
        int[] sumaF = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sumaF[i] += m[i][j];
            }
        }
        return sumaF;
    }

    static int[] sumaColumnas(int[][] m) {
        int columnas = m[0].length;
        int filas = m.length;
        int[] sumaC = new int[columnas];
        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                sumaC[j] += m[i][j];
            }
        }
        return sumaC;
    }

    static void imprimirMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
        }
        System.out.println();
    }

    static void imprimirVector(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

}
