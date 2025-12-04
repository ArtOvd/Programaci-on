
import java.util.Random;
import java.util.Scanner;

public class juego1 {
    
    public static void main(String[] args) {

        // INICIO
        // Crear Scanner, variables y contadores.
        Scanner leer = new Scanner(System.in);
        Random numRandom = new Random();
        int vUsu = 0; int vOrd = 0; int empate = 0;
        String entradaUsu = "";
        String salidaOrd = "";
        
        // Inicio del bucle con las instrucciones.
        do {

            // Vaciar las Strings al inicio de cada iteración.
            entradaUsu = "";
            salidaOrd = "";

            // JUGADA USUARIO
            System.out.print("Tu jugada (piedra/papel/tijera) o \"salir\": ");

            // Normalizamos entrada del usuario para facilitar comprobaciones.
            entradaUsu = leer.next().toLowerCase();
            if (entradaUsu.equals("salir")) {
                break;
            }

            // Comprobar que la entrada es correcta, sin errores.
            if (!entradaUsu.equals("tijera") && !entradaUsu.equals("papel")  && !entradaUsu.equals("piedra")) {
                System.out.println("Entrada incorrecta");
                continue;
            }

            // JUGADA ORDENADOR
            // Definir el intervalo del número aleatorio y condiciones para cada número obtenido.
            int salidaNum = numRandom.nextInt(3) + 1; 
            switch (salidaNum) {
                case 1:
                    salidaOrd = "tijera";
                    break;
                case 2:
                    salidaOrd = "papel";
                    break;
                case 3:
                    salidaOrd= "piedra";
                    break;
            }
            System.out.println("Ordenador juega: " + salidaOrd);
            
            // COMPROBAR QUIEN GANA. Comparación de los resultados de jugadas, insertación del resultado en contadores y muestro del resultado respecto a cada jugador.
            if ((entradaUsu.equals(salidaOrd))) {
                System.out.println("Resultado: Empate");
                empate++;
            } else if ((entradaUsu.equals("tijera") && salidaOrd.equals("papel")) || 
                       (entradaUsu.equals("papel") && salidaOrd.equals("piedra")) || 
                       (entradaUsu.equals("piedra") && salidaOrd.equals("tijera"))) {
                System.out.println("Resultado: ¡Ganas tú!");
                vUsu++;
            } else {
                System.out.println("Resultado: Gana ordenador");
                vOrd++;
            }
        } while (true);
        
        //Salida con el resultado final. 
        System.out.println("Marcador final -> Usuario: " + vUsu + " | Ordenador: "  + vOrd + " | Empates: " + empate);
    }

}
