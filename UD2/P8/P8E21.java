
import java.util.Scanner;

public class P8E21 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Dame primer número: ");
        int a = leer.nextInt();
        System.out.print("Dame otro número: ");
        int b = leer.nextInt();

        int sumaPar = 0;
        int sumaImpar = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sumaPar+=i;
            } else {
                sumaImpar+=i;
            }
        }
        System.out.println("Suma de los números pares: " + sumaPar);
        System.out.println("Suma de los números impares: " + sumaImpar);

    }

}
