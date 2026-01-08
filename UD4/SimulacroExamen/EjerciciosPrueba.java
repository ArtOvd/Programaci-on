package SimulacroExamen;

public class EjerciciosPrueba {

    static void main(String[] args) {

        int[] regalos = {5, 1, 7, 2, 9, 3};
        int max = 10;
        System.out.println(calcularViajes(max, regalos));
        /*
        int[][] mapa = {{2, 1}, {0, 3}};
        char[] movimientos = {'S', 'S', 'D'};
        System.out.println(recorridoSanta(mapa, movimientos));
        */
    }

    static int calcularViajes(int max, int[] regalos) {
        int viajes = 0;
        int suma = 0;
        for (int i = 0; i < regalos.length; i++) {
            suma += regalos[i];
            if (suma == max) {
                viajes++;
                suma = 0;
            }
            if (suma > max) {
                suma -= regalos[i];
                viajes++;
            }
        }
        if (suma < max && suma > 0) {
            viajes++;
        }
        return viajes;
    }

    static int recorridoSanta(int[][] mapa, char[] movimientos) {
        int fila = 0;
        int columna = 0;
        for (int i = 0; i < movimientos.length; i++) {
            if (movimientos[i] == 'W') {
                fila--;
            }
            if (movimientos[i] == 'S') {
                fila++;
            }
            if (movimientos[i] == 'D') {
                columna++;
            }
            if (movimientos[i] == 'A') {
                columna--;
            }
            if ((fila < 0 || fila > mapa.length - 1) || (columna < 0 || columna > mapa[0].length - 1)) {
                return -1;
            }
        }
        return mapa[fila][columna];
    }
}
