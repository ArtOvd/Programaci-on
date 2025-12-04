package P1;

import java.util.Scanner;

public class P1E4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Su numero: ");
            int num = sc.nextInt();
            array[i] = num;
        }
        System.out.println("Numero maximo: " + maximo(array));
        System.out.println("Numero minimo: " + minimo(array));

    }

    static int maximo(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    static int minimo(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}
