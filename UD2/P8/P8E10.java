
import java.util.Scanner;

public class P8E10 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        for (int i = 1; i <= 5; i++) {

            System.out.print("Introduce el precio del producto: ");
            int precio = leer.nextInt();
            suma += precio;
        }
        System.out.println(suma);
    }

}
