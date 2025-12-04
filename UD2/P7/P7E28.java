package P7;
import java.util.Scanner;

public class P7E28 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce el día (número): ");
        int dia = leer.nextInt();

        System.out.print("Introduce el mes (número): ");
        int mes = leer.nextInt();

        System.out.print("Introduce el año: ");
        int año = leer.nextInt();

        boolean validacion = false;
        
        if ( mes >= 1 && mes <= 12) {
            int diaEnMes;
            switch (mes) {
                case 2:
                    diaEnMes = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    diaEnMes = 30;
                    break;
                default:
                    diaEnMes = 31;
            }

            if (dia >= 1 && dia <= diaEnMes) {
                validacion = true;
            }
        }

        if (validacion == true) {
            System.out.print ("Fecha valida");
        } else {
            System.out.println("Fecha no valida");
        }
    }

}
