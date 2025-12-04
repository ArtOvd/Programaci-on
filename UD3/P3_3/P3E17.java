package P3_3;

import java.util.Scanner;

public class P3E17 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num;
        do {
            System.out.print("Introduce un numero: ");
            num = leer.nextInt();
            System.out.println(comprobarPrimo(num));
        } while (num != 0);

    }

    public static String comprobarPrimo(int num) {
        if (num <= 1) {
            return "Numero no es primo";
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
            return "Numero no es primo";
            }
        }
        return "Numero es primo";
    }


}
