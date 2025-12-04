package P6;
import java.util.Scanner;

public class P6E3 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce la cantidad: ");
        double inical = leer.nextDouble();
        
        System.out.print("Introduce el tipo de interés: ");
        double interes = leer.nextDouble();
        
        System.out.print("Intorduce la duración del plazo (en años): ");
        double duracion = leer.nextDouble();
        
        double anuales = inical * interes / 100 * duracion;
        double retencion = anuales * 0.18;
        double resultado = inical + anuales - retencion;

        System.out.println("Cantidad inical: " + inical);
        System.out.println("Intereses anuales: " + anuales);
        System.out.println("Retención Hacienda: " + retencion);
        System.out.println("Cantidad final: " + resultado);
    }
}
