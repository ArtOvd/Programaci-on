package P3_3;

import java.util.Scanner;

public class P3E23 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce numero entero 1:");
        int numEntero1 = leer.nextInt();
        System.out.println("Introduce numero entero 2:");
        int numEntero2 = leer.nextInt();
        System.out.println("Introduce numero entero 3:");
        int numEntero3 = leer.nextInt();
        System.out.println("Introduce numero real 1:");
        double numDouble1 = leer.nextDouble();
        System.out.println("Introduce numero real 2:");
        double numDouble2 = leer.nextDouble();

        System.out.println("El maximo de dos enteros es: " + devolverNumMax(numEntero1, numEntero2));
        System.out.println("El maximo de dos reales es: " + devolverNumMax(numDouble1, numDouble2));
        System.out.println("El maximo de tres enteros es: " + devolverNumMax(numEntero1, numEntero2, numEntero3));

    }

    public static int devolverNumMax (int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static double devolverNumMax (double num1, double num2) {
        return Math.max(num1, num2);
    }

    public static int devolverNumMax (int num1, int num2, int num3) {
        return Math.max(devolverNumMax(num1, num2), num3);
    }
}
