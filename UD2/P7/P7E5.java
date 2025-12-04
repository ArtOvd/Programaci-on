package P7;
import java.util.Scanner;

public class P7E5 {
    

    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);

    System.out.print("Escribe un número: ");
    int num1 = leer.nextInt();

    System.out.print("Escribe otro número: ");
    int num2 = leer.nextInt();

    if (num1 <= num2) {
        System.out.println(num1 + ", " + num2);
    } else {
        System.out.println(num2 + ", " + num1);
    }
    }
}
