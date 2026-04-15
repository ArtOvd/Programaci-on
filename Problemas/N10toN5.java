import java.util.Scanner;

public class N10toN5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int resta;
        int count;
        for (int i = 1; i <= num; i++){
            count = 0;
            int n10 = sc.nextInt();
            do {
                resta = n10 % 5;
                n10 = n10 / 5;
                if (resta == 4) {
                    count++;
                }
            } while (n10 > 0);
            if (count > 1) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }

}
