package P8;

import java.util.Scanner;

public class P8E38 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        int num = leer.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }   
            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
