import java.util.Scanner;

public class P3E8 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce un numero (de 1 a 10): ");
            num = leer.nextInt();
        } while (num < 1 || num > 10);

        System.out.println("Suma: " + suma1aN(num));
        System.out.println("Producto: " + producto1aN(num));
        System.out.println("Intermedio: " + intermedio1aN(num));
    }   


    public static int suma1aN (int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public static int producto1aN (int n) {
        int producto = 1;
        for (int i = 1; i <= n; i++) {
            producto *= i;
        }
        return producto;
    }

    public static double intermedio1aN (int n) {
        int media = 0;
        int suma = 0;
        int i = 1;
        for (; i <= n; i++) {
            suma += i;
        }
        media = suma / i;

        return media;
    }

}
