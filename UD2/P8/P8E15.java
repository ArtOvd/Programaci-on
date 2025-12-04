import java.util.Scanner;

public class P8E15 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        boolean neg = false;
        boolean mas = false;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Dame un número: ");
            int num = leer.nextInt();
            if ( num < 0) {
                neg = true;
            }
            if ( num > 99) {
                mas = true;
            }
        }
        if (neg == true) {
            System.out.println("Alguno de los numeros era negativo");
        } else {
            System.out.println("Ninguno de los numeros era negativo");
        }
        if (mas == true) {
            System.out.println("Alguno de los número era superior a 99");
        } else {
            System.out.println("Ninguno de los números era superior a 99");
        }

    }

}
