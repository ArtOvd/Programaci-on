package P3;
import java.util.Scanner;

public class P3E7 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Frase: ");
        String frase = leer.nextLine();
        frase = frase.replace(" ", "\n");
        System.out.println(frase);

    }

}
