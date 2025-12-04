package P3_3;

import java.util.Scanner;

public class P3E24 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Dia: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        System.out.print("Año: ");
        int año = leer.nextInt();

        System.out.println("Fecha valida? " + comprobarFecha(dia, mes, año) );
    }

    public static boolean comprobarFecha (int dia, int mes, int año) {
        if ((dia >= 1 && dia <= 30) && (mes >= 1 && mes <= 12) && (año >= 1)) {
            return true;
        } else {
            return false;
        }
    }



}
