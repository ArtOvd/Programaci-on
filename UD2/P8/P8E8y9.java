

import java.util.Scanner;

public class P8E8y9 {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce un número A: ");
        int a = leer.nextInt();

        System.out.print("Introduce un número B: ");
        int b = leer.nextInt();

        int suma = 1;
        for ( int i = a ; i < b; i++) {
            suma *=i;
        }
        System.out.println(suma); 
    }
    
}
