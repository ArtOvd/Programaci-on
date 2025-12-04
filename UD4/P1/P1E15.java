package P1;

import java.util.Scanner;

public class P1E15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        int k = 0;
        int contador = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Numero: ");
            nums[i] = sc.nextInt();
        }

        for (int j = 0; j < nums.length - 1; j++) {
            if (nums[j] < nums[j + 1] || nums[j] > nums[j + 1]) {
                System.out.print(nums[j] + " ");
                if (nums[j] > nums[j + 1]) {
                    System.out.print(", ");
                    contador++;
                }

            }
        }
        System.out.println();
        System.out.println("Cantidad de secuencias: " + contador);
    }
}

