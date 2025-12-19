package RetoUD4;

import java.util.Arrays;
import java.util.Scanner;

public class ConectaCuatro {
    static char[][] tablero = new  char[6][7];
    static int[] columnas = {1, 2, 3, 4, 5, 6, 7};
    public static void main(String[] args) {
        tablero = llenarTablero();
        imprimirTablero();
        int entrada = jugadaUsuario();
        int validar = buscarFilaLibre(entrada);
        System.out.println("Columna " + (entrada + 1) + " vacía: " + validar);
    }

    static char[][] llenarTablero () {
        for (int i = 0; i < tablero.length; i++) {
            Arrays.fill(tablero[i], '·');
        }
        return tablero;
    }
    static void imprimirTablero () {
        System.out.println("=========================");
        System.out.println("||       TABLERO       ||");
        System.out.println("=========================");
        for (int i = 0; i < columnas.length; i++) {
            if (i == 0) {
                System.out.print(columnas[i]);
            } else {
                System.out.print("   " + columnas[i]);
            }
        }
        System.out.println();
        for  (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (j == 6) {
                    System.out.print(tablero[i][j]);
                } else {
                    System.out.print(tablero[i][j] + " | ");
                }
            }
            System.out.println();
        }
        System.out.println("=========================");
    }

    static int jugadaUsuario() {
        Scanner sc = new Scanner(System.in);
        int entrada;
        while (true) {
            System.out.print("Columna a elegir (1-7): ");
            entrada = sc.nextInt();
            if (entrada >= 1 && entrada <= 7) {
                return entrada - 1;
            }
            System.out.println("Entrada invalida. Intenta otra vez.");
        }
    }

    static int buscarFilaLibre(int columna) {
        for (int i = tablero.length - 1; i >= 0; i--) {
            if (tablero[i][columna] == '·') {
                return i;
            }
        }
        return -1;
    }
}
