package P3;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class UD4P3E4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Cantidad de alumnos: ");
        int alumnos = sc.nextInt();
        System.out.print("Cantidad de asignaturas: ");
        int asignaturas = sc.nextInt();
        double[][] notas = leerNotas(sc, alumnos, asignaturas);
        System.out.println("Media por alumno: ");
        double[] mediaAl = mediaPorAlumno(notas);
        for (int i = 0; i < mediaAl.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + mediaAl[i]);
        }
        System.out.println("Media por asignatura: ");
        double[] mediaAs = mediaPorAsignatura(notas);
        for (int i = 0; i < mediaAs.length; i++) {
            System.out.println("Asignatura " + (i + 1) + ": " + mediaAs[i]);
        }
    }

    static double[][] leerNotas(Scanner sc, int a, int n) {
        double[][] notas = new double[a][n];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Nota " +  (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }
        return notas;
    }

    static double[] mediaPorAlumno(double[][] notas) {
        double[] media = new double[notas.length];
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            media[i] = suma / notas[i].length;
        }
        return media;
    }

    static double[] mediaPorAsignatura(double[][] notas) {
        double suma = 0;
        int numAsignaturas = notas[0].length;
        double[] media = new double[numAsignaturas];
        for (int i = 0; i < numAsignaturas; i++) {
            suma = 0;
            for (int j = 0; j < notas.length; j++) {
                suma += notas[j][i];
            }
            media[i] = suma / notas.length;
        }
        return media;
    }

    static void imprimirMatriz(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": ");
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Nota " + (i + 1) + ": " + m[i][j]);
            }
        }
    }

    static void imprimirVector(double[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(" [" + v[i] + "] ");
        }
    }

}
