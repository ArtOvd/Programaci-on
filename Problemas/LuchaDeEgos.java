import java.util.Scanner;
import java.util.ArrayList;

public class LuchaDeEgos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            int count = 0;
            num = sc.nextInt();

            ArrayList<Integer> fuerzas = new ArrayList<>();
            ArrayList<String> deseados = new ArrayList<>();

            for (int i = 0; i < num; i++){
                fuerzas.add(sc.nextInt());
            }
            for (int i = 0; i < num; i++){
                deseados.add(sc.next());
            }

            for (int i = 0; i < fuerzas.size(); i++){
                for (int j = i + 1; j < deseados.size() ; j++) {
                    if (fuerzas.get(i) != 0 && deseados.get(j) != null) {
                        if (deseados.get(i).startsWith("=")) {
                            if (Integer.parseInt(String.valueOf(deseados.get(i).charAt(1))) == fuerzas.get(j) && Integer.parseInt(String.valueOf(deseados.get(j).charAt(1))) == fuerzas.get(i)) {
                                System.out.println((i + 1) + " " + (j + 1));
                                count++;
                                fuerzas.set(i, 0);
                                deseados.set(i, null);
                                fuerzas.set(j, 0);
                                deseados.set(j, null);
                            }
                        } else if (deseados.get(i).startsWith(">")) {
                            if (Integer.parseInt(String.valueOf(deseados.get(i).charAt(1))) < fuerzas.get(j) && Integer.parseInt(String.valueOf(deseados.get(j).charAt(1))) > fuerzas.get(i)) {
                                System.out.println((i + 1) + " " + (j + 1));
                                count++;
                                fuerzas.set(i, 0);
                                deseados.set(i, null);
                                fuerzas.set(j, 0);
                                deseados.set(j, null);
                            }
                        } else if (deseados.get(i).startsWith("<")) {
                            if (Integer.parseInt(String.valueOf(deseados.get(i).charAt(1))) > fuerzas.get(j) && Integer.parseInt(String.valueOf(deseados.get(j).charAt(1))) < fuerzas.get(i)) {
                                System.out.println((i + 1) + " " + (j + 1));
                                count++;
                                fuerzas.set(i, 0);
                                deseados.set(i, null);
                                fuerzas.set(j, 0);
                                deseados.set(j, null);
                            }
                        }
                    }
                }
            }

            if (count < 1) {
                System.out.println("NO HAY");
            }
            System.out.println("---");

        } while (num > 0 && num <= 100);
    }
}