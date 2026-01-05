package RetoUD4;

import java.util.Arrays;
import java.util.Scanner;

public class Buscaminas {
    static char[][] tablero = new char[6][6];
    static boolean[][] visible = new boolean[6][6];
    static int countMines = 0;
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        boolean fin = false;
        tablero = llenarTablero();
        colocarMinas();
        prepararTablero();
        while (!fin) {
            imprimirTablero();
            fin = jugadaUsuario();
            int cerradas = 0;
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero.length; j++) {
                    if (!visible[i][j]) {
                        cerradas++;
                    }
                }
            }
            if (cerradas == 5 && !fin) {
                System.out.println("Has ganado!");
                fin = true;
            }
        }
        imprimirTablero();
    }

    static char[][] llenarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            Arrays.fill(tablero[i], '·');
        }
        return tablero;
    }

    static void imprimirTablero() {
        System.out.println("=========================");
        System.out.println("||     BUSCAMINAS      ||");
        System.out.println("=========================");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < tablero[i].length; j++) {
                if (visible[i][j]) {
                    System.out.print(tablero[i][j] + " | ");
                } else {
                    System.out.print("# | ");
                }
            }
            System.out.println();
        }
        System.out.println("=========================");
    }

    static void colocarMinas() {
        int minasPuestas = 0;
        while (minasPuestas < 5) {
            int fila = (int) (Math.random() * tablero.length);
            int columna = (int) (Math.random() * tablero[0].length);
            if (tablero[fila][columna] != '*') {
                tablero[fila][columna] = '*';
                minasPuestas++;
            }
        }
    }

    static boolean jugadaUsuario() {
        boolean valido = false;
        int fila = 0;
        int columna = 0;
        while (!valido) {
            System.out.print("Indica la fila: ");
            fila = sc.nextInt();
            System.out.print("Indica la columna: ");
            columna = sc.nextInt();
            if ((fila <= tablero.length && columna <= tablero[0].length) && fila >= 0 && columna >= 0) {
                valido = true;
            }
            visible[fila][columna] = true;
            if (tablero[fila][columna] == '*') {
                System.out.println("Has encontrado a una mina. Partida acabada.");
                return true;
            }
        }
        return false;
    }

    static int contarMinasCercanas(int fila, int columna) {
        int contador = 0;
        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {
                if ((i < 0 || i >= 6) || (j < 0 || j >= 6)) {
                    continue;
                }
                if (i == fila && j == columna) {
                    continue;
                } else {
                    if (tablero[i][j] == '*') {
                        contador++;
                    }
                }
            }
        }
        return contador;
    }

    static void prepararTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == '·') {
                    int numero = contarMinasCercanas(i, j);
                    tablero[i][j] = (char) (numero + '0');
                }
            }
        }
    }
}
