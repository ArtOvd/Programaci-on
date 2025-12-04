package P1;

import java.util.Scanner;

public class P1E2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[6];
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("Su numero: ");
            int num = sc.nextInt();
            array[i] = num;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }

}
