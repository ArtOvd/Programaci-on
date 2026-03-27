package PR6_5_Ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjsExcepciones {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       // ej8();
       // ej9();
       // ej10();
       // ej11();
    }


    public static void ej8() {
        try {
            System.out.println("Intoduce un número: ");
            int num = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto");
        }
    }
    public static void ej9() {
        try {
            System.out.print("Valor A: ");
            int a =  sc.nextInt();
            sc.nextLine();
            System.out.print("Valor B: ");
            int b = sc.nextInt();
            sc.nextLine();
            int res = a / b;
        } catch (InputMismatchException e) {
            System.out.println("Valores introducidos de tipo no válido.");
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético");
        }
    }
    public static void ej10() {
        double[] arr = new double[5];
        for (int i = 0; i < arr.length; i++) {
            while (true) {
                try {
                    System.out.print("Introduce un valor: ");
                    double num = sc.nextDouble();
                    arr[i] = num;
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Valor introducido de tipo no valido.");
                    sc.next();
                }
            }
        }
        for (double v : arr) {
            System.out.println(v);
        }
    }
    public static void ej11() {

        int[] arr = new int[(int) (Math.random() * 100) + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println("Tamaño del array: " +  arr.length);
        try {
            System.out.print("Introduce la posición del array: ");
            int pos = sc.nextInt();
            sc.nextLine();
            System.out.println("Valor en la posición elegida: " + arr[pos]);
        } catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posición en array incorrecta.");
        }
    }
}
