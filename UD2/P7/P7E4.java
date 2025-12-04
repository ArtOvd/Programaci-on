package P7;
import java.util.Scanner;

public class P7E4 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Dame un número: ");
        int num = leer.nextInt();

        if (num >= 0) {
            System.out.println("Número es positivo");
        } else {
            System.out.println("Número es negativo");
        }

    }
}
