import java.util.Scanner;

public class P3E5 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int num = leer.nextInt();
        System.out.println(millas_a_kilometros(num));

    }

    public static double millas_a_kilometros(int millas) {
        return millas * 1.60934;
    }

}
