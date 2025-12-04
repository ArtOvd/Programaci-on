
import java.util.Scanner;

public class P8E23 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce el número: ");
        int num = leer.nextInt();
        int res = 1;
        if (num == 0) {
            System.out.println(num + "! = 1" );
        } else {
            for (int i = 1; i <= num; i++) {
                res *= i; 
            }
        }
        System.out.println(num + "! = " + res);
    }

}
