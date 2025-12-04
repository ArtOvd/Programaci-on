package P3_3;

import java.util.Scanner;

public class P3E21 {
    
    public static void main(String[] args) {
        do {
        int entrada = menu();
        switch (entrada) {
            case 1:
                System.out.println("El resultado es: " + circunferencia(pideRadio()));
                break;
            case 2:
                System.out.println("El resultado es: " + area(pideRadio()));
                break;
            case 3:
                System.out.println("El resultado es: " + volumen(pideRadio()));
                break;
            case 4:
                double r = pideRadio();
                System.out.println("El restultado es: ");
                System.out.println("Circunferencia: " + circunferencia(r));
                System.out.println("Area: " + area(r));
                System.out.println("Volumen: " + volumen(r));    
                break;
            case 5:
                return;
            default:
                System.out.println("Error. Elige una de los opciones.");
                break;
        } 
        } while (true);
    }

    public static int menu() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Elige una opcion: ");
        System.out.println("1. Circunferencia (radio por PI)");
        System.out.println("2. Area (radio al cuadrado por PI)");
        System.out.println("3. Volumen (radio al cubo por PI por 4/3)");
        System.out.println("4. Todas");
        System.out.println("5. Salir");
        int num = leer.nextInt();
        return num;
    }

    public static double pideRadio() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce el radio: ");
        double radio = leer.nextDouble();
        return radio;
    }

    public static double circunferencia(double r) {
        double circ = r * Math.PI;
        return circ;
    }

    public static double area(double r) {
        double area = r * r;
        return area; 
    }

    public static double volumen(double r) {
        double vol = (r * r * r) * Math.PI * (4.0 / 3.0);
        return vol;
    }
}
