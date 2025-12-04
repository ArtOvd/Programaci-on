package P3_2;

import java.util.Scanner;

public class P3E14 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Caracter a usar: ");
        String caracter = leer.next();

        System.out.print("Tamaño del triangulo: ");
        int lineas = leer.nextInt();
        
        imprimirTriangulo(caracter, lineas);
    }

    public static void imprimirTriangulo (String letra, int lineas) {
        for (int i = 1; i <= lineas; i++) {

            for (int j = lineas; j >= 1; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print(letra);
                }
            }
            for (int x = 1; x <= i - 1 ; x++) {
                System.out.print(letra);

            }
            System.out.println();
        } 
    }

}
