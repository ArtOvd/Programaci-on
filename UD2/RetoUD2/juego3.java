
import java.util.Random;
import java.util.Scanner;

public class juego3 {
    
    public static void main(String[] args) {

        //INICIO
        //Variables principales
        Scanner leer = new Scanner(System.in);
        String tablero = "123456789";
        System.out.println("Tablero: ");

        //Bucle para crear la tabla
        for (int j = 1; j <= tablero.length(); j++) {
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

        //Bucle principal de los turnos
        do {

        //TURNO DEL USUARIO
            System.out.print("Tu turno (1-9): ");
            int entradaUsu = leer.nextInt();

        //COMPROBACIONES DE ENTRADA
            if (entradaUsu < 1 || entradaUsu > 9) {
                System.out.println("Elige un numero entre 1 y 9.");
                continue;
            }

            if (tablero.charAt(entradaUsu - 1) == 'X' || tablero.charAt(entradaUsu - 1) == 'O') {
                System.out.println("Esa casilla ya está ocupada. Elige otra.");
                continue;
            }

        //Cambio de los numeros a X (usuario)
            tablero = tablero.substring(0, entradaUsu - 1) + 'X' + tablero.substring(entradaUsu);
        
        //Creación de la tabla
            for (int j = 1; j <= tablero.length(); j++) {
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

        //Condiciones de la victoria del usuario
            if ((tablero.charAt(0) == 'X' && tablero.charAt(1) == 'X' && tablero.charAt(2) == 'X') ||
                (tablero.charAt(3) == 'X' && tablero.charAt(4) == 'X' && tablero.charAt(5) == 'X') ||
                (tablero.charAt(6) == 'X' && tablero.charAt(7) == 'X' && tablero.charAt(8) == 'X') ||
                (tablero.charAt(0) == 'X' && tablero.charAt(3) == 'X' && tablero.charAt(6) == 'X') ||
                (tablero.charAt(1) == 'X' && tablero.charAt(4) == 'X' && tablero.charAt(7) == 'X') ||
                (tablero.charAt(2) == 'X' && tablero.charAt(5) == 'X' && tablero.charAt(8) == 'X') ||
                (tablero.charAt(0) == 'X' && tablero.charAt(4) == 'X' && tablero.charAt(8) == 'X') ||
                (tablero.charAt(2) == 'X' && tablero.charAt(4) == 'X' && tablero.charAt(6) == 'X')) {
                System.out.println("Ganas tú!");
                break;
            }

        //Condición del empate
            boolean empate = true;
            for (int i = 1; i <= 9; i++) {
                if (tablero.contains(String.valueOf(i))) {
                    empate = false;
                    break;
                }
            }
            if (empate) {
                System.out.println("Empate!");
                break;
            }


        //TURNO DEL ORDENADOR
        //Variables para bucles
            System.out.println("Turno del ordenador...");
            Random entradaOrd = new Random();
            int numOrd;

        //Creacion del numero aleatorio para posicionarse
            do {
                numOrd = entradaOrd.nextInt(tablero.length());
            } while (tablero.charAt(numOrd) == 'X' || tablero.charAt(numOrd) == 'O');
        
        //Cambio del número al "O" (ordenador)
            tablero = tablero.substring(0, numOrd) + 'O' + tablero.substring(numOrd + 1);


        //Creación de la tabla
            for (int j = 1; j <= tablero.length(); j++) {
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


        //Condiciones de la victoria del ordenador
            if ((tablero.charAt(0) == 'O' && tablero.charAt(1) == 'O' && tablero.charAt(2) == 'O') ||
                (tablero.charAt(3) == 'O' && tablero.charAt(4) == 'O' && tablero.charAt(5) == 'O') ||
                (tablero.charAt(6) == 'O' && tablero.charAt(7) == 'O' && tablero.charAt(8) == 'O') ||
                (tablero.charAt(0) == 'O' && tablero.charAt(3) == 'O' && tablero.charAt(6) == 'O') ||
                (tablero.charAt(1) == 'O' && tablero.charAt(4) == 'O' && tablero.charAt(7) == 'O') ||
                (tablero.charAt(2) == 'O' && tablero.charAt(5) == 'O' && tablero.charAt(8) == 'O') ||
                (tablero.charAt(0) == 'O' && tablero.charAt(4) == 'O' && tablero.charAt(8) == 'O') ||
                (tablero.charAt(2) == 'O' && tablero.charAt(4) == 'O' && tablero.charAt(6) == 'O')) {
                System.out.println("Gana ordenador");
                break;
            }

        //Condiciones del empate
            empate = true;
            for (int i = 1; i <= 9; i++) {
                if (tablero.contains(String.valueOf(i))) {
                    empate = false;
                    break;
                }
            }
            if (empate) {
                System.out.println("Empate!");
                break;
            }
        } while (true);

    //FIN DEL JUEGO
    }
}