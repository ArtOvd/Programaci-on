
import java.util.Scanner;

public class P8E22 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introduce la base: ");
        int a = leer.nextInt();
        System.out.print("Introduce el exponente: ");
        int b = leer.nextInt();
        int res = 1;
        
        for (int i = 1; i <= b; i++) {
            res*=a;
        }
        System.out.println("Resultado es " + res);

    }
    
}
