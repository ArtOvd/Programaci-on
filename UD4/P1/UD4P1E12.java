package P1;

import java.util.Scanner;

public class UD4P1E12 {

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        desplazarDerecha(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    static void desplazarDerecha(int[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor de desplazamiento: ");
        int d = sc.nextInt();
        d = d % a.length;
        int tmp;
        for (int i = 0; i < d; i++) {
            tmp = a[a.length - 1];
            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = tmp;
        }
    }
}
