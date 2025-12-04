
import java.util.Scanner;

public class P8E5 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce un número A: ");
        int a = leer.nextInt();

        System.out.print("Introduce un número B: ");
        int b = leer.nextInt();
        for (; a >= b; a-=2 ) {
            System.out.println(a);
        }

    }

}
