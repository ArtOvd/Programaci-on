package P1;

import java.util.Scanner;

public class UD4P1E8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1, 2, 3, 4, 5}; 
        System.out.print("Posicion a cambiar (1-4): ");
        int pos = sc.nextInt();
        System.out.println("Numero: ");
        int num = sc.nextInt();
        nums[pos] = num;
        imprimir(nums);
    }

    static void imprimir (int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
