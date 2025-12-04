import java.util.Scanner;

public class P3E6 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Dame el precio sin IVA: ");
            int num = leer.nextInt();
            System.out.println("IVA incluida : " + precioConIVA(num));
        }
    }

    public static double precioConIVA (double precio) {
        return precio * 1.21;
    }

}
