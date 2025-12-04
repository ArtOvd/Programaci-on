
import java.util.Scanner;

public class P8E4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce un número A: ");
        int a = leer.nextInt();

        System.out.print("Introduce un número B: ");
        int b = leer.nextInt();
        for (; a <= b; b-- ) {
            System.out.println(b);
        }

    }

        
}
