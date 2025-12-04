package P1;

import java.util.Scanner;

public class P1E13 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums1 = new int[8];
        int[] nums2 = new int[8];
        int entrada;
        int contador = 0;
        System.out.println("Array 1: ");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print("Numero:");
            entrada = sc.nextInt();
            nums1[i] = entrada;
        }

        System.out.println("Array 2: ");
        for (int j = 0; j < nums2.length; j++) {
            System.out.print("Numero:");
            entrada = sc.nextInt();
            nums2[j] = entrada;
        }

        for (int k = 0; k < nums1.length; k++) {
            for (int h = 0; h < nums2.length; h++) {
                if (nums1[k] == nums2[h])  {
                    System.out.print(" [" + k + "] ");
                    contador++;
                }
            }
        }

        System.out.println("Contador: " + contador);
    }

}
