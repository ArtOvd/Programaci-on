package P7;
import java.util.Scanner;

public class P7E3 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Dame un número: ");
        int num1 = leer.nextInt();

        System.out.print("Dame otro número: ");
        int num2 = leer.nextInt();

        if (num1 > num2) {
            System.out.println("Número " + num1 + " es mayor que " + num2);
        } else if (num2 > num1){
            System.out.println("Número " + num2 + " es mayor que " + num1);
        } else {
            System.out.println("Los dos numeros son iguales");
        }

    }
}
