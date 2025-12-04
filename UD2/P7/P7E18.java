package P7;
import java.util.Scanner;

public class P7E18 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduce una letra: ");
        String letra = leer.nextLine();

        if (letra.equals(letra.toUpperCase())) {
            System.out.println("La letra es mayuscula");
        } else {
            System.out.println("La letra es minuscula");
        }
    }

}
