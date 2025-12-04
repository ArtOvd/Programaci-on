package P7;
import java.util.Scanner;

public class P7E19 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce la cantidad de grados: ");
        int grados = leer.nextInt();

        System.out.print("Introduce un caracter: ");
        String letra = leer.next();
        letra.toLowerCase();

        if (letra.equals("s")) {
            System.out.println("Sin de grados: " + Math.sin(grados)); 
        } else if (letra.equals("c")) {
            System.out.println("Cos de grados: " + Math.cos(grados));
        } else if (letra.equals("t")) {
            System.out.println("Tan de grados: " + Math.tan(grados));
        } else {
            System.out.println("Error");
        }
        
    }

}
