import java.util.Scanner;

public class P3E2 {
    
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
           System.out.println("Indicatu edad: ");
           int edad = leer.nextInt();
           System.out.println(esMayorEdad(edad));
    }

    public static boolean esMayorEdad(int a) {
         if (a >= 18 ) {
            return true;
        } else {
            return false;
        }
    }
}
