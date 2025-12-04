import java.util.Scanner;

public class P8E41 {
    
     public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int num = leer.nextInt();
        
        if (num < 2 ) {
            System.out.println("No hay numeros primos");
        } else {
        for ( int i = 2; i <= num; i++) {
            boolean esPrimo = true;
            for (int j = 2; j * j <= i; j++)
            if (i % j == 0) {
                esPrimo = false;
                break;
            } 
            if (esPrimo == true) {
                System.out.print(i + ", ");
            }
        }
        }
    }
}
