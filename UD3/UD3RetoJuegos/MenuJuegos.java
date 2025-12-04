package UD3RetoJuegos;

import java.util.Scanner;

public class MenuJuegos {

    public static void main(String[] args) {

        // INICIO
        // Crear variables
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        // Bucle principal
        while (!salir) {
            // Imprimir el menu y preguntar la opción
            mostrarMenu();
            int opcion = leerOpcion(sc);

            switch (opcion) {
                case 1:
                    System.out.println("JUEGO: PIEDRA, PAPEL Y TIJERAS");
                    JuegoPiedraPapelTijera.jugarPPT();
                    break;
                case 2:
                    System.out.println("JUEGO: AHORCADO");
                    JuegoAhorcado.jugarAhorcado();
                    ;
                    break;
                case 3:
                    System.out.println("JUEGO: TRES EN RAYA");
                    JuegoTresEnRaya.jugarTresEnRaya();
                    break;
                case 4:
                    salir = true;
                    System.out.println("Gracias por jugar!");
                    break;
                default:
                    System.out.println("Opción no valida. Elige otra");
            }

            // Opcíon de salida del programa
            if (!salir && opcion >= 1 && opcion <= 3) {
                System.out.println("\nPresiona Enter para volver al menú...");
                sc.nextLine();
                sc.nextLine();
            }
        }
        sc.close();

    }

    // Imprimir el menú
    public static void mostrarMenu() {
        System.out.println("MENU DE JUEGOS");
        System.out.println("1. Piedra, Papel y Tijera");
        System.out.println("2. Ahorcado");
        System.out.println("3. Tres en Raya");
        System.out.println("4. Salir");
    }

    // Devolver la opción elegida
    public static int leerOpcion(Scanner sc) {
        System.out.print("Elige una opción (1-4): ");
        int opcion = sc.nextInt();
        return opcion;
    }

    // FIN

}
