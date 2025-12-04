package P3;
import java.util.Scanner;

public class P3E5 {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Frase: ");
        String f = leer.nextLine();

        System.out.print("Palabra 1: ");
        String p1 = leer.nextLine();

        System.out.print("Palabra 2: ");
        String p2 = leer.nextLine();

        System.out.println(f.replace(p1, p2));

    }

}
