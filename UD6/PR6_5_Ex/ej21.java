package PR6_5_Ex;

import java.util.Scanner;

public class ej21 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            try {
                System.out.print("Introduce el valor positivo: ");
                int p = sc.nextInt();
                sc.nextLine();
                System.out.print("Introduce el valor negativo: ");
                int n = sc.nextInt();
                sc.nextLine();
                System.out.println("Valores obtenidos: ");
                imprimePositivo(p);
                imprimeNegativo(n);
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }

    public static void imprimePositivo(int p) throws Exception {
        if (p >= 0) {
            System.out.println(p);
        } else {
            throw new Exception("El número tiene que ser negativo.");
        }
    }

    public static void imprimeNegativo(int n) throws Exception {
        if (n < 0) {
            System.out.println(n);
        } else {
            throw new Exception("El número tiene que ser negativo.");
        }
    }
}
