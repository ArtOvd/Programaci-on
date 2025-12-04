import java.util.Scanner;

public class P3E4 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        int num = leer.nextInt();
        System.out.println(dimeSigno(num));

    }

    public static int dimeSigno (int a) {
       
        if (a < 0) {
            a = -1;
        } else if (a == 0){
            a = 0;
        } else {
            a = 1;  
        }
        return a;
    }
}
