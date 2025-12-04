import java.util.Scanner;

public class P8E29 {

        public static void main(String[] args) {

            Scanner leer = new Scanner(System.in);

            System.out.print("Dame un numero: ");
            int num = leer.nextInt();
            int suma = 0;
            while (num > 0) {
                int ult = num % 10;
                suma += ult;
                num /= 10;
            }
            System.out.println("La suma es: " + suma);
        }

}
