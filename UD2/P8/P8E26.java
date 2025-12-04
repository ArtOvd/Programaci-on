import java.util.Scanner;

public class P8E26 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int num = leer.nextInt();
        boolean primo = true;
        if (num < 2 ) {
            primo = false;
        }
        for ( int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        System.out.println(primo);
    }

}
