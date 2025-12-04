import java.util.Scanner;

public class P8E17 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Dame un número: ");
        int num = leer.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num*i));
        }

    }

}
