package P7;
import java.util.Scanner;

public class P7E11 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Escribe el día de la semana (de 1 a 7): ");
        int dia = leer.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número incorrecto");
                break;
        }
    }

}
