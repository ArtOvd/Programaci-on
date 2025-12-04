package P1;

import java.util.Scanner;

public class P1E7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[8];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Numero: ");
            int num = sc.nextInt();
            nums[i] += num;
        }
        System.out.print("Numero adicional: ");
        int numAd = sc.nextInt();
        System.out.println(indiceDe(nums, numAd));
    }

    static int indiceDe (int[] a, int b) {
        int apariencia = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                apariencia++;
            } 
        }
        if (apariencia == 0) {
            return -1;
        } else {
            return apariencia;
        }
        
    }

}
