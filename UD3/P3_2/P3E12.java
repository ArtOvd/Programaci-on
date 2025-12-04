package P3_2;

import java.util.Scanner;

public class P3E12 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Kilometros: ");
        int kilo  = leer.nextInt();
        System.out.println("Será " + convertirKilos(kilo) + " millas");
    }

    public static double convertirKilos (int kilo)  {
        return kilo / 1.60934;
    }

}
