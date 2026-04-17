import java.util.Scanner;

public class ejF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ton = 0, mil = 0, plata = 0, topl = 0, teh = 0, zp = 0;
        int res = 0;
        for (int i = 0; i < num; i++) {
            res = 0;
                ton = sc.nextInt();
                mil = sc.nextInt();
                plata = sc.nextInt();
                topl = sc.nextInt();
                teh = sc.nextInt();
                zp = sc.nextInt();
            res += (ton * plata) * mil;
            if (topl > 0) {
                res -= (topl * mil) * 2;
            }
            res -= teh + zp;
            System.out.println(res);
        }


    }

}
