package P3;
import java.util.Scanner;

public class P3E2 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Intorduce una cadena de texto: ");
        String str1 = leer.nextLine();

        System.out.print("Introduce otra cadena de texto: ");
        String str2 = leer.nextLine();

        System.out.println(str1.equalsIgnoreCase(str2));

    }

}
