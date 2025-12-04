import java.util.Scanner;

public class P8E33 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        int num = leer.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("Tabla del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }

    }

}
