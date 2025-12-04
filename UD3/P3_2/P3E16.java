package P3_2;

import java.util.Scanner;

public class P3E16 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce primer numero: ");
        double num1 = leer.nextDouble();
        System.out.print("Introduce segundo numero: ");
        double num2 = leer.nextDouble();

        System.out.println(
            "Tienes un " + revisarNota(num1) + " en el primer examen, un " + revisarNota(num2) + " en el segundo y un " + calcularMedia(num1, num2) + " de media.");
    }

    public static String revisarNota(double num) {
        if (num >= 0 && num < 5) {
            return "Suspenso";
        } else if (num >= 5 && num < 6) {
            return "Suficiente";
        } else if (num >= 6 && num < 7) {
            return "Bien";
        } else if (num >= 7 && num < 9) {
            return "Notable";
        } else if (num >= 9 && num <= 10) {
            return "Sobresaliente";
        } else {
            return "Nota no válida";
        }
    }

    public static String calcularMedia(double num1, double num2) {
        double media = (num1 + num2) / 2;
        return revisarNota(media);
    }
}
