import java.util.Scanner;

public class P8E45 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introduce una frase: "); 
        String frase = leer.nextLine().toLowerCase().trim();

        String fInvertida = "";
        String fLimpia = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            if (
            frase.charAt(i) != ' ' && frase.charAt(i) != ',' &&
            frase.charAt(i) != '.' && frase.charAt(i) != '?' &&
            frase.charAt(i) != '!' && frase.charAt(i) != ';' &&
            frase.charAt(i) != ':') {
                fInvertida += frase.charAt(i);
            } else {
                continue;
            }
        }
        for (int i = 0; i < frase.length(); i++) {
            if (
            frase.charAt(i) != ' ' && frase.charAt(i) != ',' &&
            frase.charAt(i) != '.' && frase.charAt(i) != '?' &&
            frase.charAt(i) != '!' && frase.charAt(i) != ';' &&
            frase.charAt(i) != ':') {
                fLimpia += frase.charAt(i);
            } else {
                continue;
            }
        }
        if (fInvertida.equals(fLimpia)) {
            System.out.println("Es un palindromo!");
        } else {
            System.out.println("No es un palindromo");
        }
    }

}
