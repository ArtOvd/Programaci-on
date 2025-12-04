package P1;

import java.util.Scanner;

public class P1E14 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor 1: ");
        int num1 = sc.nextInt();
        System.out.print("Valor 2: ");
        int num2 = sc.nextInt();
        System.out.print("Valor 3: ");
        int num3 = sc.nextInt();

        for (int i = 0; i < secuenciaAritmetica(num1, num2, num3).length; i++) {
            System.out.print(" [" + secuenciaAritmetica(num1, num2, num3)[i] + "] ");
        }
    }

    static int[] secuenciaAritmetica (int v, int i, int n) {
        int[] nums = new int[n];
        nums[0] = v;
        for (int j = 1; j < nums.length; j++) {
            for (int k = 1; k < n ; k++) {
                nums[k] = v + (k * i);
            }
        }

        return nums;
    }
 
}
