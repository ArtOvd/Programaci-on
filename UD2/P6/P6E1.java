package P6;
import java.util.Scanner;

public class P6E1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce los segundos: ");

        int segundos = leer.nextInt();
        int dias = segundos / 86400;
        int horas = segundos / 3600;
        int minutos = segundos / 60;

        System.out.println("Dias: " + dias + "\n" + "Horas: " + horas + "\n" + "Minutos: " + minutos + "\n" + "Segundos: " + segundos);
        
    }
}
