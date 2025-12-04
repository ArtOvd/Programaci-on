import java.util.Scanner;

public class P8E34 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        int num = leer.nextInt();
        int suma = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println("Tabla del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
                suma += (i*j);
            }
        }
        System.out.println("Total: " + suma);


    }

}
