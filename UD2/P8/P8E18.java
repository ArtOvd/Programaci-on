import java.util.Scanner;

public class P8E18 {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int multi = 1;
        for (int i = 1; i <= 10; i++) {
            suma += i;
            multi *= i;
        }
        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + multi);

    }

}
