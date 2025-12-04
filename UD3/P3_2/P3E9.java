package P3_2;

import java.util.Scanner;

public class P3E9 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Numero 1: ");
        int num1 = leer.nextInt();

        System.out.print("Numero 2: ");
        int num2 = leer.nextInt();

        System.out.print("Numero 3: ");
        int num3 = leer.nextInt();

        if (compararMayorMenor(num1, num2) < num3) {
            System.out.println("Numero " + num3 + " es lo más elevado");
        } else if (compararMayorMenor(num1, num2) > num3) {
            System.out.println("Numero " + compararMayorMenor(num1, num2) + " es lo más elevado");
        }
    }

    public static int compararMayorMenor (int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

}
