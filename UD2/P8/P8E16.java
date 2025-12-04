import java.util.Scanner;

public class P8E16 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int pos = 0;
        int neg = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Dame un número: ");
            int num = leer.nextInt();
                if (num > 0) {
                pos++;
                } else {
                neg++;
                }
        }
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
    }

}
