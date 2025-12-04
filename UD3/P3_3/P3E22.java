package P3_3;

import java.util.Scanner;

public class P3E22 {
    
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
        System.out.println("Introduce numero largo 1:");
        long numLong1 = leer.nextLong();
        System.out.println("Introduce numero largo 2:");
        double numLong2 = leer.nextLong();
        
        System.out.println("Suma de dos enteros es: " + devolverSuma(numEntero1, numEntero2));
        System.out.println("Suma de dos reales es: " + devolverSuma(numDouble1, numDouble2));
        System.out.println("Suma de dos largos : " + devolverSuma(numLong1, numLong2));
        System.out.println("Suma de tres enteros es: " + devolverSuma(numEntero1, numEntero2, numEntero3));
    }

    public static int devolverSuma (int x, int y) {
        int suma = x + y;
        return suma;
    }

    public static double devolverSuma (double x, double y) {
        double suma = x + y;
        return suma;
    }

    public static long devolverSuma (long x, long y) {
        long suma = x + y;
        return suma;
    }

    public static int devolverSuma (int x, int y, int z) {
        int suma = x + y + z;
        return suma;
    }


}
