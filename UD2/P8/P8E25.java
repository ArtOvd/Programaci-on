
import java.util.Scanner;

public class P8E25 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = leer.nextInt();
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;
        for (int i = 1; i <= num; i++) {
            int numRandom = (int) (Math.random() * 6) + 1;
            switch (numRandom) {
                case 1:
                    num1++;
                    break;
                case 2:  
                    num2++;
                    break;
                case 3:  
                    num3++;
                    break;
                case 4:  
                    num4++;
                    break;
                case 5:  
                    num5++;
                    break;
                case 6:  
                    num6++;
                    break;
            }
        }
        double res1 = (double) num1 / num * 100;
        double res2 = (double) num2 / num * 100;
        double res3 = (double) num3 / num * 100;
        double res4 = (double) num4 / num * 100;
        double res5 = (double) num5 / num * 100;
        double res6 = (double) num6 / num * 100;
        System.out.println("Num 1: " + num1 + " veces y " + res1 + "%");
        System.out.println("Num 2: " + num2 + " veces y " + res2 + "%");
        System.out.println("Num 3: " + num3 + " veces y " + res3 + "%");
        System.out.println("Num 4: " + num4 + " veces y " + res4 + "%");
        System.out.println("Num 5: " + num5 + " veces y " + res5 + "%");
        System.out.println("Num 6: " + num6 + " veces y " + res6 + "%");
    }

}
