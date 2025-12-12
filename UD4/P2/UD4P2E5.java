package P2;

import java.util.Scanner;

public class UD4P2E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean res = false;
        String[] palabras = new  String[7];
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Introduce una palabra: ");
            palabras[i] = sc.nextLine();
        }
        for (int i = 0; i < palabras.length; i++) {
            if (i != palabras.length - 1) {
                if (palabras[i].compareTo(palabras[i + 1]) < 0) {
                    res = true;
                } else if (palabras[i].compareTo(palabras[i + 1]) > 0) {
                    res = false;
                    break;
                }
            } else {
                if (palabras[i].compareTo(palabras[i - 1]) > 0) {
                    res = true;
                }else {
                    res = false;
                    break;
                }
            }
        }
        if (res) {
            System.out.println("Las palabras SÍ están ordenadas alfabéticamente");
        } else {
            System.out.println("Las palabras NO están ordenadas alfabéticamente");
        }
    }
}
