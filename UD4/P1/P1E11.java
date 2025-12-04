package P1;

import java.util.Scanner;

public class P1E11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Introduce el numero: ");
            int num = sc.nextInt();
            nums[i] += num;
        }

        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }

        System.out.println();

        reemplazarNegativosPorCero(nums);
    }

    static void reemplazarNegativosPorCero(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] = 0;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}