
import java.util.Scanner;

public class juego2 {
    
    public static void main(String[] args) {
        
        //INICIO
        //Crear variables
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce su palabra: ");
        String pSecreta = leer.next().toLowerCase();
        String pMostrada = "";
        int intentos = 6;

        //Bucle para cifrar la palabra
        for ( int i = 0; i < pSecreta.length(); i++) {
            pMostrada += '_';
        }
        //Muestro de palabra
        System.out.println("(Ahorcado) Palabra: " + pMostrada);


        //Bucle principal
        do {

            //Variables del bucle
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Letra: ");
            char letra = leer.next().toLowerCase().charAt(0);
            boolean apariencia = false;

            //Cambio de los símbolos
            for (int j = 0; j < pSecreta.length() ; j++) {
                if ( pSecreta.charAt(j) == letra && pMostrada.charAt(j) == '_') {
                    pMostrada = pMostrada.substring(0, j) + letra + pMostrada.substring(j + 1);
                    apariencia = true;
                }
            }
            
            //Comprobación de la letra
            if (apariencia == true) {
                    System.out.println("Bien: " + pMostrada);
            } else {
                    System.out.println("Mal: " + pMostrada);
                    intentos--;
            }


            //Condiciones de victoria/perdida
            if (!pMostrada.contains("_") && intentos > 0) {
                System.out.println("Has ganado! La palabra era: "  + pSecreta);
                break;
            } else if (intentos == 0) {
                System.out.println("Has perdido. La palabra era: " + pSecreta);
                break;
            }
            
        } while (true);
    }
    //FIN
 
}
