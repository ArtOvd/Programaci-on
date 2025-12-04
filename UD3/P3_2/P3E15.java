package P3_2;

import java.util.Scanner;

public class P3E15 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero, contador = 0, suma = 0;
        int positivos = 0, negativos = 0;
        int minimo = 0, maximo = 0;
        boolean primero = true;

        do {
            System.out.print("Introduce un número (0 para salir): ");
            numero = leer.nextInt();

            if (numero != 0) {
                contador++;
                suma += numero;

                positivos = contarPositivos(positivos, numero);
                negativos = contarNegativos(negativos, numero);

                if (primero) {
                    minimo = maximo = numero;
                    primero = false;
                } else {
                    minimo = calcularMin(minimo, numero);
                    maximo = calcularMax(maximo, numero);
                }
            }

        } while (numero != 0);

        if (contador > 0) {
            System.out.println("Cantidad de números: " + contador);
            System.out.println("Positivos: " + positivos);
            System.out.println("Negativos: " + negativos);
            System.out.println("Mínimo: " + minimo);
            System.out.println("Máximo: " + maximo);
            System.out.println("Suma total: " + suma);
            System.out.println("Media: " + (double) suma / contador);
        } else {
            System.out.println("No se introdujeron números.");
        }
    }

    public static int contarPositivos(int pos, int n) {
        if (n > 0) {
            pos++;
        }
        return pos;
    }

    public static int contarNegativos(int neg, int n) {
        if (n < 0) {
            neg++;
        }
        return neg;
    }

    public static int calcularMin(int min, int n) {
        if (n < min) {
            min = n;
        }
        return min;
    }

    public static int calcularMax(int max, int n) {
        if (n > max) {
            max = n;
        }
        return max;
    }
}
