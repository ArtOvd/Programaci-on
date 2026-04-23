import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int x = 0;
        int y = 0;
        int res = 0;
        do {
            res = 0;
            num = sc.nextInt();
            if (num != 0) {
                for (int i = 0; i < num; i++) {
                    x = sc.nextInt();
                    y = sc.nextInt();
                    res = (res + x) - y;
                }
                System.out.println(res);
            }
        } while (num != 0);



    }

}
