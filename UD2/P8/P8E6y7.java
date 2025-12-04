
import java.util.Scanner;

public class P8E6y7 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce un número A: ");
        int a = leer.nextInt();

        System.out.print("Introduce un número B: ");
        int b = leer.nextInt();

        int suma = 0;
        for ( int i = a ; i < b; i++) {
            suma +=i;
        }
        System.out.println(suma);


    }

}
