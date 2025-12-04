package UD3RetoJuegos;

import java.util.Scanner;

public class JuegoTresEnRaya {

    // Muestra la tabla del juego
    static void imprimirTabla(String tablero) {
        System.out.println("Tablero: ");
        for (int j = 0; j <= tablero.length(); j++) {
            switch (j) {
                case 1:
                case 2:
                case 4:
                case 5:
                case 7:
                case 8:
                    System.out.print(tablero.charAt(j - 1) + " | ");
                    break;
                case 3:
                case 6:
                    System.out.print(tablero.charAt(j - 1));
                    System.out.println("\n---------");
                    break;
                case 9:
                    System.out.println(tablero.charAt(j - 1));
                    break;
            }
        }
        System.out.println();
    }

    // Devuelve el numero de entrada del usuario:
    static int devolverEntradaUsuario(Scanner sc) {
        System.out.println("Tu turno (1-9): ");
        int usuario = sc.nextInt();
        return usuario;
    }

    // Devolver la comprobación de la entrada del usario:
    static boolean comprobarEntradaUsuario(int usuario) {
        if (usuario < 1 || usuario > 9) {
            return true;
        } else {
            return false;
        }
    }

    // Comprobar si la casilla en tabla esta libre:
    static boolean comprobarCasilla(String tablero, int usuario) {
        if (tablero.charAt(usuario - 1) == 'X' || tablero.charAt(usuario - 1) == 'O') {
            return true;
        } else {
            return false;
        }
    }

    // Pintar la tabla en turno de usuario:
    static String pintarTablaUsuario(String tablero, int usuario) {
        tablero = tablero.substring(0, usuario - 1) + 'X' + tablero.substring(usuario);
        return tablero;
    }

    // Devuelve el numero de entrada aleatoria del ordenador (entre 1 y 9) y
    // comprueba si la casilla esta libre:
    static int devolverEntradaOrdenador(String tablero, int ordenador) {
        System.out.println("Turno del ordenador...");
        int entrada;
        do {
            entrada = (int) (Math.random() * 9) + 1;
        } while (tablero.charAt(entrada - 1) == 'X' || tablero.charAt(entrada - 1) == 'O');
        return entrada;
    }

    // Pintar la tabla en turno de ordenador:
    static String pintarTablaOrdenador(String tablero, int ordenador) {
        tablero = tablero.substring(0, ordenador - 1) + 'O' + tablero.substring(ordenador);
        return tablero;
    }

    // Comprobar la victoria del usuario:
    static boolean comprobarVictoriaUsuario(String tablero) {
        if ((tablero.charAt(0) == 'X' && tablero.charAt(1) == 'X' && tablero.charAt(2) == 'X') ||
                (tablero.charAt(3) == 'X' && tablero.charAt(4) == 'X' && tablero.charAt(5) == 'X') ||
                (tablero.charAt(6) == 'X' && tablero.charAt(7) == 'X' && tablero.charAt(8) == 'X') ||
                (tablero.charAt(0) == 'X' && tablero.charAt(3) == 'X' && tablero.charAt(6) == 'X') ||
                (tablero.charAt(1) == 'X' && tablero.charAt(4) == 'X' && tablero.charAt(7) == 'X') ||
                (tablero.charAt(2) == 'X' && tablero.charAt(5) == 'X' && tablero.charAt(8) == 'X') ||
                (tablero.charAt(0) == 'X' && tablero.charAt(4) == 'X' && tablero.charAt(8) == 'X') ||
                (tablero.charAt(2) == 'X' && tablero.charAt(4) == 'X' && tablero.charAt(6) == 'X')) {
            return true;
        } else {
            return false;
        }

    }

    // Comprobar la victoria del ordenador:
    static boolean comprobarVictoriaOrdenador(String tablero) {
        if ((tablero.charAt(0) == 'O' && tablero.charAt(1) == 'O' && tablero.charAt(2) == 'O') ||
                (tablero.charAt(3) == 'O' && tablero.charAt(4) == 'O' && tablero.charAt(5) == 'O') ||
                (tablero.charAt(6) == 'O' && tablero.charAt(7) == 'O' && tablero.charAt(8) == 'O') ||
                (tablero.charAt(0) == 'O' && tablero.charAt(3) == 'O' && tablero.charAt(6) == 'O') ||
                (tablero.charAt(1) == 'O' && tablero.charAt(4) == 'O' && tablero.charAt(7) == 'O') ||
                (tablero.charAt(2) == 'O' && tablero.charAt(5) == 'O' && tablero.charAt(8) == 'O') ||
                (tablero.charAt(0) == 'O' && tablero.charAt(4) == 'O' && tablero.charAt(8) == 'O') ||
                (tablero.charAt(2) == 'O' && tablero.charAt(4) == 'O' && tablero.charAt(6) == 'O')) {
            return true;
        } else {
            return false;
        }
    }

    // Comrpobar la empate:
    static boolean comprobarEmpate(String tablero) {
        boolean empate = true;
        for (int i = 1; i <= 9; i++) {
            if (tablero.contains(String.valueOf(i))) {
                empate = false;
                break;
            }
        }
        return empate;
    }

    public static void jugarTresEnRaya() {

        // INICIO
        // Variables principales
        Scanner sc = new Scanner(System.in);
        String tablero = "123456789";
        int usuario;
        int ordenador = 0;
        // Mostrar la tabla inical:
        imprimirTabla(tablero);

        // Inicio de los turnos:
        do {
            // TURNO DEL USUARIO
            usuario = devolverEntradaUsuario(sc);

            // Comprobar la entrada
            if (comprobarEntradaUsuario(usuario)) {
                System.out.println("Elige un numero entre 1 y 9.");
                continue;
            }
            // Comprobar la casilla
            if (comprobarCasilla(tablero, usuario)) {
                System.out.println("Esa casilla ya está ocupada. Elige otra.");
                continue;
            }
            // Pintar la tabla (X)
            tablero = pintarTablaUsuario(tablero, usuario);
            imprimirTabla(tablero);

            // Comprobar la victoria del usuario
            if (comprobarVictoriaUsuario(tablero)) {
                System.out.println("Ganas tú!");
                break;
            }

            // Comprobar empate
            if (comprobarEmpate(tablero)) {
                System.out.println("Empate!");
                break;
            }

            // TURNO DEL ORDENADOR
            ordenador = devolverEntradaOrdenador(tablero, ordenador);

            // Pintar la tabla (O)
            tablero = pintarTablaOrdenador(tablero, ordenador);
            imprimirTabla(tablero);

            // Comprobar victoria del ordenador
            if (comprobarVictoriaOrdenador(tablero)) {
                System.out.println("Gana ordenador");
                break;
            }

            // Comprobar empate
            if (comprobarEmpate(tablero)) {
                System.out.println("Empate!");
                break;
            }
        } while (true);

        // FIN
    }
}