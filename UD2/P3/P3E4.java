package P3;
import java.util.Scanner;

public class P3E4 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Intorduce una frase: ");
        String frase = leer.nextLine();

        System.out.print("Introduce una palabra: ");
        String palabra = leer.nextLine();

        boolean comp1 = frase.contains(palabra);
        boolean comp2 = frase.startsWith(palabra);
        boolean comp3 = frase.endsWith(palabra);

        if (comp1 == true) {
            System.out.println("Su frase contiene la palabra " + palabra);
        }
        if (comp2 == true) {
            System.out.println("Su frase empiea por palabra " + palabra);
        }
        if (comp3 == true) {
            System.out.println("Su frase finaliza por palabra " + palabra);
        }
    }

}
