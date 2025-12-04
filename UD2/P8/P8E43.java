import java.util.Scanner;

public class P8E43 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String f = leer.nextLine().toLowerCase();

        System.out.print("Introduce una palabra: ");
        String p = leer.next().toLowerCase();

        int apariencia = 0;
        for (int i = 0; i < f.length(); i++) {
            String pActual = "";
            while (
            f.charAt(i) != ' ' && f.charAt(i) != ',' &&
            f.charAt(i) != '.' && f.charAt(i) != '?' &&
            f.charAt(i) != '!' && f.charAt(i) != ';' &&
            f.charAt(i) != ':') {
               pActual += f.charAt(i);
               i++;
               if (pActual.equals(p)) {
                apariencia++;
               }
            }
        }
        System.out.println("Palabra " + p + " aparece " + apariencia + " veces en la frase");
    }

}