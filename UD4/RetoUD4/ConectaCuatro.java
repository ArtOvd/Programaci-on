package RetoUD4;

import java.util.Arrays;
import java.util.Scanner;

public class ConectaCuatro {
    static char[][] tablero = new char[6][7];
    static int[] columnas = {1, 2, 3, 4, 5, 6, 7};
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        tablero = llenarTablero();
        char jugadorActual = 'X';
        boolean fin = false;
        int contador = 0;

        while (!fin) {
            imprimirTablero();
            System.out.println("Turno de: " + jugadorActual);
            int jugada = jugadaUsuario();
            if (colocarFicha(jugada, jugadorActual)) {
                contador++;
                if (comprobarVictoria(jugadorActual)) {
                    imprimirTablero();
                    System.out.println("EL JUGADOR " + jugadorActual + " HA GANADO!");
                    fin = true;
                } else if (contador == 42) {
                    imprimirTablero();
                    System.out.println("EMPATE! No quedan más movimientos.");
                    fin = true;
                } else {
                    if (jugadorActual == 'X') {
                        jugadorActual = 'O';
                    } else {
                        jugadorActual = 'X';
                    }
                }
            }
        }
    }

    static char[][] llenarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            Arrays.fill(tablero[i], '·');
        }
        return tablero;
    }

    static void imprimirTablero() {
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
        for (int i = 0; i < tablero.length; i++) {
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

    static boolean comprobarFila(int columna) {
        for (int i = tablero.length - 1; i >= 0; i--) {
            if (tablero[i][columna] == '·') {
                return true;
            }
        }
        return false;
    }

    static boolean colocarFicha(int columna, char jugador) {
        if (!comprobarFila(columna)) {
            System.out.println("Esta columna está llena. Elige otra.");
            return false;
        }
        for (int i = tablero.length - 1; i >= 0; i--) {
            if (tablero[i][columna] == '·') {
                tablero[i][columna] = jugador;
                return true;
            }
        }
        return false;
    }

    static boolean comprobarVictoria(char jugador) {
        return comprobarHorizontal(jugador) ||
                comprobarVertical(jugador) ||
                comprobarDiagonal1(jugador) ||
                comprobarDiagonal2(jugador);
    }

    static boolean comprobarHorizontal(char jugador) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (tablero[i][j] == jugador &&
                        tablero[i][j + 1] == jugador &&
                        tablero[i][j + 2] == jugador &&
                        tablero[i][j + 3] == jugador) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean comprobarVertical(char jugador) {
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 3; i++) {
                if (tablero[i][j] == jugador &&
                        tablero[i + 1][j] == jugador &&
                        tablero[i + 2][j] == jugador &&
                        tablero[i + 3][j] == jugador) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean comprobarDiagonal1(char jugador) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (tablero[i][j] == jugador &&
                        tablero[i + 1][j + 1] == jugador &&
                        tablero[i + 2][j + 2] == jugador &&
                        tablero[i + 3][j + 3] == jugador) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean comprobarDiagonal2(char jugador) {
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (tablero[i][j] == jugador &&
                        tablero[i - 1][j + 1] == jugador &&
                        tablero[i - 2][j + 2] == jugador &&
                        tablero[i - 3][j + 3] == jugador) {
                    return true;
                }
            }
        }
        return false;
    }
}
