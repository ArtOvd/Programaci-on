import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hor = 0;
        int per = 0;
        do {
            int count = 0;
            hor = sc.nextInt();
            per = sc.nextInt();
            int[] trabajos = new int[per];
            int[] deseos = new int[per];
            for (int i = 0; i < per; i++) {
                trabajos[i] = sc.nextInt();
                deseos[i] = sc.nextInt();
            }
            int max = trabajos[0];
            for (int i = 0; i < trabajos.length; i++) {
                for (int j = i + 1; j < trabajos.length; j++) {
                    if (trabajos[i] != -1 && trabajos[j] != -1) {
                         if (trabajos[j] >= max) {
                            max = trabajos[j];
                            if (hor - deseos[j] >= 0) {
                                hor -= deseos[j];
                                trabajos[j] = -1;
                                deseos[j] = -1;
                                count++;
                            } else {
                                break;
                            }
                        } else if (trabajos[j] == trabajos[i]) {
                                if (deseos[i] < deseos[j]) {
                                    if  (hor - deseos[i] >= 0) {
                                        hor -= deseos[i];
                                        deseos[i] = -1;
                                        trabajos[i] = -1;
                                    }
                                } else {
                                    if (hor - deseos[i] >= 0) {
                                        hor -= deseos[j];
                                        deseos[j] = -1;
                                        trabajos[j] = -1;
                                    }
                                }
                                count++;

                        } else {
                            if (hor - deseos[j] >= 0) {
                                hor -= deseos[j];
                                trabajos[j] = -1;
                                deseos[j] = -1;
                                count++;
                            }
                        }

                    }
                }

            }
            System.out.print(count);
            System.out.println(" " + hor);
        } while (hor != 0 && per != 0);
    }
}
