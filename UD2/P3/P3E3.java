package P3;
import java.util.Scanner;

public class P3E3 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Intorduce su nombre: ");
        String nom = leer.nextLine();

        System.out.print("Introduce su primer apellido: ");
        String ape1 = leer.nextLine();

        System.out.print("Introduce su segundo appelido: ");
        String ape2 = leer.nextLine();

        String username = nom.substring(0,3) + ape1.substring(0,3) + ape2.substring(0,3);
        username = username.toUpperCase();

        System.out.println("Su código es " + username);
    }

}
