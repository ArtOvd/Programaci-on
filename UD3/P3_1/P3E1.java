import java.util.Scanner;

public class P3E1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        double num1 = leer.nextDouble();

        System.out.print("Dame otro numero: ");
        double num2 = leer.nextDouble();

        System.out.println(multiplica(num1, num2));
    }

    public static double multiplica(double a, double b) {
        return a * b;
    }

}
