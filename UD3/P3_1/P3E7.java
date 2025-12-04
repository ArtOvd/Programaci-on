import java.util.Scanner;

public class P3E7 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ancho: ");
        double ancho = leer.nextDouble();

        System.out.print("Alto: ");
        double alto = leer.nextDouble();

        System.out.println("Perimetro: " + perimetroRectangulo(ancho, alto));
        System.out.println("Area: " + areaRectangulo(ancho, alto));
    }


    public static double perimetroRectangulo (double ancho, double alto) {
        return 2 * (ancho + alto);
    }

    public static double areaRectangulo (double ancho, double alto) {
        return ancho * alto;
    }
}
