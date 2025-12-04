package P7;
import java.util.Scanner;

public class P7E14 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Cuantos hombres hay? ");
        int hombres = leer.nextInt();

        System.out.print("Cuantas mujeres hay? ");
        int mujeres = leer.nextInt();

        int total = hombres + mujeres;
        double pHombres = (100 * hombres) / total;
        double pMujeres = (100 * mujeres) / total;

        System.out.println("Procentaje de hombres: " + pHombres + "%");
        System.out.println("Procentaje de mujeres: " + pMujeres + "%");

        if ( pHombres > pMujeres) {
            System.out.println("Hay mas hombres");
        } else if (pMujeres > pHombres) {
            System.out.println("Hay mas mujeres");
        } else {
            System.out.println("La cantidad es igual");
        }
    }
}
