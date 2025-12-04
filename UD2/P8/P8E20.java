
import java.util.Scanner;

public class P8E20 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int suma = 0;
        double media = 0;
        boolean ace = false;
        boolean neg = false;
        int i = 0;

        do {
            System.out.print("Introduce una nota (de 1 a 10): ");
            int nota = leer.nextInt();
            if ( nota >= 1 && nota <= 10) {
                suma += nota;
                if (nota == 10) {
                ace = true;
                }
            } else if (nota == -1) {
                neg = true;
                i--;
            }
            i++;
            media = (double) suma / i;
        } while (neg != true);
        System.out.println("Suma total: " + suma);
        System.out.printf("Media: %.2f\n", media);
        if ( ace == true) {
            System.out.println("Había un 10");
        }
    }

}
