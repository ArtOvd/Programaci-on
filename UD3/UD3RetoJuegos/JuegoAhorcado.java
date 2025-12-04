package UD3RetoJuegos;

import java.util.Scanner;

public class JuegoAhorcado {

    // Pide la palabra secreta al usuario y la devuelve en minúsculas.
    static String pedirPalabraSecreta(Scanner sc) {
        System.out.print("Introduce su palabra: ");
        String palabraSecreta = sc.next();
        return palabraSecreta.toLowerCase();
    }

    // Devuelve una palabra secreta al azar de entre varias posibles
    // Nota: método alternativo a pedirPalabraSecreta(Scanner sc)
    static String generaPalabraSecreta() {
        Scanner sc = new Scanner(System.in);
        String palabra1 = "", palabra2 = "", palabra3 = "";
        for (int i = 1; i <= 3; i++) {
            if (i == 1) {
                palabra1 = pedirPalabraSecreta(sc);
            } else if (i == 2) {
                palabra2 = pedirPalabraSecreta(sc);
            } else {
                palabra3 = pedirPalabraSecreta(sc);
            }
        }
        int random = (int) (Math.random() * 3) + 1;
        switch (random) {
            case 1:
                return palabra1;
            case 2:
                return palabra2;
            case 3:
                return palabra3;
            default:
                return "";
        }
    }

    // Devuelve una cadena con tantos guiones como letras tenga ‘secreta’.
    static String inicializarPalabraMostrada(String secreta) {
        String palabraCifrada = "";
        for (int i = 0; i < secreta.length(); i++) {
            palabraCifrada += '_';
        }
        return palabraCifrada;
    }

    // Pide al usuario una letra y devuelve el primer carácter introducido.
    static char pedirLetra(Scanner sc) {
        System.out.print("Letra: ");
        char letra = sc.next().charAt(0);
        return letra;
    }

    // Comprueba si la letra introducida está dentro de la palabra secreta.
    static boolean contieneLetra(String secreta, char letra) {
        for (int i = 0; i < secreta.length(); i++) {
            if (secreta.charAt(i) == letra) {
                return true;
            }
        }
        return false;
    }

    // Devuelve la palabra mostrada tras descubrir las letras acertadas.
    static String descubrirLetras(String secreta, String mostrada, char letra) {
        for (int j = 0; j < secreta.length(); j++) {
            if (secreta.charAt(j) == letra && mostrada.charAt(j) == '_') {
                mostrada = mostrada.substring(0, j) + letra + mostrada.substring(j + 1);
            }
        }
        return mostrada;
    }

    // Devuelve true si ‘mostrada’ ya no contiene guiones (palabra completa).
    static boolean palabraCompleta(String mostrada) {
        if (!mostrada.contains("_")) {
            return true;
        } else {
            return false;
        }
    }

    // Muestra el estado actual del juego: palabra mostrada e intentos restantes.
    static void mostrarEstado(String mostrada, int intentos) {
        System.out.println(mostrada);
        System.out.println("Intentos restantes: " + intentos);
    }

    // Muestra el resultado final: si ha ganado o perdido y la palabra secreta.
    static void mostrarResultadoFinal(String secreta, boolean haGanado) {
        if (palabraCompleta(secreta) && haGanado) {
            System.out.println("Has ganado! La palabra era: " + secreta);
        } else {
            System.out.println("Has perdido. La palabra era: " + secreta);
        }
    }

    public static void jugarAhorcado() {

        // INICIO
        // Crear variables necesarios:
        Scanner sc = new Scanner(System.in);
        int intentos = 6;
        boolean haGanado = false;
        String mostrada;
        String secreta;
        secreta = generaPalabraSecreta();
        mostrada = inicializarPalabraMostrada(secreta);

        // Pedir 3 palabras y luego mostrar una de ellas ya cifrada con intentos
        // restantes:
        System.out.print("(Ahorcado) Palabra: ");
        mostrarEstado(mostrada, intentos);

        // Bucle con turnos:
        do {
            // Pedir una letra para advinar:
            char letra = pedirLetra(sc);

            // Resultado de la entrada:
            if (contieneLetra(secreta, letra)) {
                mostrada = descubrirLetras(secreta, mostrada, letra);
                System.out.print("Bien: ");
            } else {
                System.out.print("Mal: ");
                intentos--;
            }

            // Mostrar el estado actual:
            mostrarEstado(mostrada, intentos);

            // Condicion para salir del bucle (victoria):
            if (palabraCompleta(mostrada)) {
                haGanado = true;
                break;
            }
        } while (intentos > 0);
        // Fin del bucle

        // Mostrar resultado del juego según las condiciones:
        mostrarResultadoFinal(secreta, haGanado);

        // FIN
    }

}