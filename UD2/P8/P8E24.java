import java.util.Scanner;

public class P8E24 {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Dame un numero: ");   
            int num = leer.nextInt();

            int a = 1, b = 1;
            System.out.print(a + ", " + b);

            for (int i = 3; i <= num; i++) {
                int c = a + b;
                System.out.print(", " + c);
                a = b;
                b = c;
            }

    }

}
