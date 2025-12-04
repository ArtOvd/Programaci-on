package P1;

import java.util.Scanner;
public class UD4P1E16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[12];
        int tmp;
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Numero: ");
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] == 0) {
                    tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
            System.out.print("[ " + nums[i] + " ]");
        }
    }
}
