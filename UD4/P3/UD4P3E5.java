package P3;

import java.util.Scanner;

public class UD4P3E5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] tablero = leerTablero3x3(sc);
        char jugador1 = 'X';
        char jugador = 'O';
        imprimirTablero(tablero);
        System.out.println("Ganador: " + ganador(tablero));
    }

    static char[][] leerTablero3x3(Scanner sc) {
        char[][] tablero = new char[3][3];
        char entrada;
        System.out.println("Llenar el tablero: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boolean valido = false;
                while (!valido) {
                    System.out.print("Celda" + " [" + i + ", " + j + "]: ");
                    entrada = sc.next().toUpperCase().charAt(0);
                    if (entrada == 'X' || entrada == 'O' || entrada == '-') {
                        tablero[i][j] = entrada;
                        valido = true;
                    } else {
                        System.out.println("Error: entrada no valida");
                    }
                }
            }
        }
        return tablero;
    }

    static void imprimirTablero(char[][] tablero) {
        System.out.println("TABLERO: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean hayGanador(char[][] tablero, char jugador) {
        if (tablero[0][0] == jugador && tablero[0][1] == jugador && tablero[0][2] == jugador) {
            return true;
        } else if (tablero[1][0] == jugador && tablero[1][1] == jugador && tablero[1][2] == jugador) {
            return true;
        } else if (tablero[2][0] == jugador && tablero[2][1] == jugador && tablero[2][2] == jugador) {
            return true;
        } else if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            return true;
        } else if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
            return true;
        } else if (tablero[0][0] == jugador && tablero[1][0] == jugador && tablero[2][0] == jugador) {
            return true;
        } else if (tablero[0][1] == jugador && tablero[1][1] == jugador && tablero[2][1] == jugador) {
            return true;
        } else if (tablero[0][2] == jugador && tablero[1][2] == jugador && tablero[2][2] == jugador) {
            return true;
        } else {
            return false;
        }
    }

    static char ganador(char[][] tablero) {
        if (hayGanador(tablero, 'X')) {
            return 'X';
        } else if (hayGanador(tablero, 'O')) {
            return 'O';
        } else {
            return '-';
        }
    }
}
