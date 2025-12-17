package P3;

import java.util.Random;
import java.util.Scanner;

public class UD4P3E6 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int[][] matriz = leerMatriz9x9(sc);
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[][] leerMatriz9x9(Scanner sc) {
        int numRandom = new Random().nextInt(9) + 1;
        int[][] matriz = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                boolean valido = false;
                while (!valido) {
                    numRandom = new Random().nextInt(9) + 1;
                    boolean repetido = false;
                    for (int k = 0; k < j; k++) {
                        if (matriz[i][k] == numRandom) {
                            repetido = true;
                            break;
                        }
                    }
                    if (!repetido) {
                        matriz[i][j] = numRandom;
                        valido = true;
                    }
                }
            }
        }
        return matriz;
    }
}
