package P7;
import java.util.Scanner;

public class P7E16 {
    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);

        System.out.print("Advina un número entre 1 y 6: ");
        int advinar = leer.nextInt();

        int num = (int) (Math.random() * 6) + 1;
        System.out.println("Número aleatorio: " + num);

        if (advinar == num ) {
            System.out.println("Número advinado!");
        } else {
            System.out.println("Número no advinado.");
        }

    }

}
