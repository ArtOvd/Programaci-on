package P3;
import java.util.Scanner;

public class P3E6 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Frase: ");
        String frase = leer.nextLine();

        System.out.println("Separador: ");
        String separador = leer.nextLine();

        frase = frase.replace(separador,"\n");
        System.out.println(' ' + frase.trim());

    }

    
}
