import java.util.Scanner;

public class P8E14 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        boolean multi = false;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Dame un número: ");
            int num = leer.nextInt();
            if ( num % 10 == 0) {
                multi = true;
            }
        }
        if (multi == true) {
            System.out.println("Alguno de los numeros era el multipo de 10");
        } else {
            System.out.println("Ninguno de los numeros era el multiplo de 10");
        }

    }

}
