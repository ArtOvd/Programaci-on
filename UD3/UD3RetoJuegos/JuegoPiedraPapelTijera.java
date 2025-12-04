package UD3RetoJuegos;

import java.util.Scanner;

public class JuegoPiedraPapelTijera {

    // Pide al usuario su jugada (“piedra”, “papel”, “tijera” o “salir”) y la
    // devuelve como String en minúsculas. Si no es válida la vuelve a pedir.
    static String leerJugadaUsuario(Scanner sc) {
        String resultado;
        do {
            System.out.print("Tu jugada (piedra/papel/tijera) o \"salir\": ");
            resultado = sc.next().toLowerCase();
            if (esValida(resultado)) {
                break;
            } else {
                System.out.print("Entrada incorreta.");
            }
        } while (true);
        return resultado;
    }

    // Devuelve la jugada del ordenador al azar: “piedra”, “papel” o “tijera”.
    static String generarJugadaPC() {
        System.out.print("Jugada del ordenador: ");
        int resultado = (int) (Math.random() * 3) + 1;
        switch (resultado) {
            case 1:
                return "tijera";
            case 2:
                return "papel";
            case 3:
                return "piedra";
            default:
                return "";
        }
    }

    // Devuelve el resultado de la ronda: 1 si gana el usuario, 0 si hay empate, -1
    // si gana el ordenador.
    static int determinarResultado(String usuario, String pc) {
        if (usuario.equals(pc)) {
            return 0;
        } else if (usuario.equals("tijera") && pc.equals("papel") ||
                usuario.equals("papel") && pc.equals("piedra") ||
                usuario.equals("piedra") && pc.equals("tijera")) {
            return 1;
        } else {
            return -1;
        }
    }

    // Muestra la jugada y el resultado (“¡Ganas tú!”, “Gana el ordenador” o
    // “Empate”).
    static void mostrarResultado(int resultado) {
        if (resultado == 1) {
            System.out.println("Ganas tú!");
        } else if (resultado == -1) {
            System.out.println("Gana el ordenador");
        } else {
            System.out.println("Empate");
        }
    }

    // Muestra el marcador final con victorias, derrotas y empates.
    static void mostrarMarcador(int victoriasUsuario, int victoriasPC, int empates) {
        System.out.println("Victorias: " + victoriasUsuario);
        System.out.println("Derrotas: " + victoriasPC);
        System.out.println("Empates: " + empates);
    }

    // Comprueba si la jugada introducida por el usuario es válida (piedra, papel,
    // tijera o salir).
    static boolean esValida(String jugada) {
        if (jugada.equals("piedra") || jugada.equals("papel") ||
                jugada.equals("tijera") || jugada.equals("salir")) {
            return true;
        } else {
            return false;
        }
    }

    public static void jugarPPT() {
        Scanner sc = new Scanner(System.in);
        // INICIO
        // Crear variables necesarios
        int victoriasUsuario = 0, victoriasPC = 0, empates = 0;
        String jugadaUsuario, jugadaPC;

        // Bucle principal
        do {
            // TURNO DE USUARIO
            jugadaUsuario = leerJugadaUsuario(sc);
            if (jugadaUsuario.equals("salir"))
                break;

            // TURNO DE ORDENADOR
            jugadaPC = generarJugadaPC();
            System.out.println(jugadaPC);

            // Comparación y mostrada del resultado de turno
            int resultado = determinarResultado(jugadaUsuario, jugadaPC);
            mostrarResultado(resultado);
            if (resultado == 1)
                victoriasUsuario++;
            else if (resultado == -1)
                victoriasPC++;
            else
                empates++;
        } while (!jugadaUsuario.equals("salir"));

        // Mostrada de resultados de partida
        mostrarMarcador(victoriasUsuario, victoriasPC, empates);

        // FIN
    }

}