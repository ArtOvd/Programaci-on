package P3_3;

import java.util.Scanner;

public class P3E20 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();

        imprimirTablasMulti(num);
    }


    public static void imprimirTablasMulti (int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println("Tabla " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            
        }
    }

}
