package P7;
import java.util.Scanner;

public class P7E17 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Entra un precio: ");
        double precioBase = leer.nextDouble();

        System.out.print("Entra el  % IVA: ");
        double iva = leer.nextDouble() / 100;
        double precioFinal = precioBase + (precioBase * iva);
        if (precioBase == 0 || iva == 0) {
            System.out.println("Error. Datos incorrectos.");
        } else {
            System.out.println("Precio final: " + precioFinal);
        }

        
 
    }
}
