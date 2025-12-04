
import java.util.Scanner;

public class P8E11 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int precio = 0;
        do {
            System.out.print("Introduce el precio del producto: ");
            precio = leer.nextInt();
            if( precio > 0) {
                suma += precio;
            }
        } while ( precio > 0);

        System.out.println(suma);
    }

}
