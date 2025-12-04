import java.util.Scanner;

public class P8E28 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int media = max / 2;
        boolean fin = false;
        do {
            System.out.print("Es el " + media + "? (s)Sí (+)Es mayor (-)Es menor: ");
            String respuesta = leer.next();
            if ( respuesta.equals("s")) {
                fin = true;
            }
            else if (respuesta.equals("+")) {
                min = media;
            } else if (respuesta.equals("-")) {
                max = media;
            }
            media = (min + max) / 2;
        } while (fin != true);
        System.out.println("He acertado!");

    }

}
