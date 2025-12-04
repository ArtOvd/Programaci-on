package P3_2;

import java.util.Scanner;

public class P3E13 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Precio sin descuento: ");
        int precio = leer.nextInt();

        System.out.print("Descuento a aplicar (%): ");
        int descuento = leer.nextInt();

        System.out.println("Precio con descuento aplicado: " + aplicarDescuento(precio, descuento));
    }


    public static double aplicarDescuento (int precio, int descuento) {
        double resta = precio * (descuento / 100.0);
        double res = precio - resta;
        return res;
    }
}
