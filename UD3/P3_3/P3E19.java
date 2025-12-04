package P3_3;

import java.util.Scanner;

public class P3E19 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int x = leer.nextInt();
        System.out.println("Introduce un numero:");
        int y = leer.nextInt();
        System.out.println("Introduce un numero:");
        int z = leer.nextInt();

        System.out.println(comprobarEcuacion(x, y, z));
    }

    public static String comprobarEcuacion (int x, int y, int z) {
        if (x * x + y * y == z * z) {
            return "La ecuacion es correcta.";
        } else {
            return "La ecuacion es incorrecta.";
        }   
    }
}
