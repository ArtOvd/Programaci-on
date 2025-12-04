import java.util.Scanner;

public class P3E3 {
    

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame un numero:");
        int num1 = leer.nextInt();
        System.out.println("Dame otro numero: ");
        int num2 = leer.nextInt();

        System.out.println(minimo(num1, num2));

    }

    public static int minimo(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
}
