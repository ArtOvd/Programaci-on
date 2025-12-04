package Base;
import java.util.Scanner;
public class EjemploScanner {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int edad = leer.nextInt();
        System.out.println("Tu edad es: " + edad);
        
    }
}
