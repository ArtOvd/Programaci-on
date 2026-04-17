import java.sql.SQLOutput;
import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        String[][] rejila = new String[y][x];
        for (int i = 0; i < rejila.length; i++) {
            for (int j = 0; j < rejila[i].length; j++) {
                rejila[i][j] = sc.next();
            }
            System.out.println();
        }
        for (int i = 0; i < rejila.length; i++) {
            for (int j = 0; j < rejila[i].length; j++) {
                if (rejila[i][j].equals(".")) {
                    if (i != rejila.length - 1 && j != rejila[i].length - 1) {
                        if (rejila[i + 1][j].equals(".") || rejila[i][j + 1].equals(".")) {
                            count++;
                        }
                    } else {
                        if (rejila[i - 1][j].equals(".") || rejila[i][j - 1].equals(".")) {
                            count++;
                        }
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("IMPOSIBLE");
        } else {
            System.out.println(count);
        }


    }

}
