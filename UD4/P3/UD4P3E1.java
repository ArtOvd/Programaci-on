package P3;

public class UD4P3E1 {

    public static void main(String[] args) {
        int[][] matriz = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        imprimirMatriz(matriz);
    }

    static void imprimirMatriz (int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
