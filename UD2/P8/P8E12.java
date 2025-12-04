
import java.util.Scanner;

public class P8E12 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce un número A: ");
        int a = leer.nextInt();

        System.out.print("Introduce un número B: ");
        int b = leer.nextInt();

        if (a >= 0 && b >= 0) {
            if (a < b) {
                for (int i = a; i <= b; i++) {
                    System.out.println(i); 
                }
            } else if (b < a) {
                for (int i = b; i <= a; i++) {
                    System.out.println(i);
                }
            }
            

        }

    }

}
