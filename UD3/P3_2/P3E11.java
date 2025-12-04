package P3_2;

import java.util.Scanner;

public class P3E11 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Numero: ");
        int num = leer.nextInt();
        imprimirTablaMulti(num);
    }

    public static void imprimirTablaMulti(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
