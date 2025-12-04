package P3;
import java.util.Scanner;

public class P3E1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String str = leer.nextLine();
        
        System.out.println(str.toUpperCase() + "\n" + str.toLowerCase());
    }

}
