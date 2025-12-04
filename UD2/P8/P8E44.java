import java.util.Scanner;

public class P8E44 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introduce una frase: "); 
        String frase = leer.nextLine().toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            String separar = "";
            if (frase.charAt(i) != ' ') {
                separar += frase.charAt(i);
                System.out.print(separar);
            } else {
                System.out.println(separar);
            }
        }
    }

}
