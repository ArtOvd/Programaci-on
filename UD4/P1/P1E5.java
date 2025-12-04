package P1;

import java.util.Scanner;

public class P1E5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Max: ");
        int max = sc.nextInt();
        System.out.print("Min: ");
        int min = sc.nextInt();

        int[] nums = generaAleatorios(n, min, max);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
        System.out.println("Pares: " + contarParesImpares(nums, true));
        System.out.println("Impares: " + contarParesImpares(nums, false));
    }

    static int[] generaAleatorios(int n, int min, int max) {
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            n = (int) (Math.random() * max) + min;
            array[i] += n;
        }
        return array;
    }

    static int contarParesImpares(int[] a, boolean pares) {
        int par = 0;
        int impar = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        if (pares) {
            return par;
        } else {
            return impar;
        }
    }

}
