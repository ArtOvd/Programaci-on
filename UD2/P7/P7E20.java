package P7;
import java.util.Scanner;

public class P7E20 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Escribe una nota (de 0 a 10): ");
        int nota = leer.nextInt();

        if (nota >= 0 && nota < 3) {
            System.out.println("Nota muy deficiente");
        } else if (nota >= 3 && nota < 5) {
            System.out.println("Nota insuficiente");
        } else if (nota == 5) {
            System.out.println("Nota buena");
        } else if (nota >= 6 && nota < 9) {
            System.out.println("Notable");
        } else if (nota == 9 || nota == 10) {
            System.out.println("Nota sobresaliente");
        } else {
            System.out.println("Nota incorrecta");
        }
    
    }

}
