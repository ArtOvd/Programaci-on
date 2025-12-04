package P7;
import java.util.Scanner;

public class P7E15 {
    

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Escribe la primera nota: ");
        int nota1 = leer.nextInt();

        System.out.print("Escribe la segunda nota: ");
        int nota2 = leer.nextInt();

        System.out.print("Escribe la tercera nota: ");
        int nota3 = leer.nextInt();

        int media = (nota1 + nota2 + nota3) / 3;
        int nFinal = (int) Math.round(media);

        if (nota1 < 5 || nota2 < 5 || nota3 < 5) {
            nFinal = Math.min(nFinal, 4);
        }

        System.out.println("La nota final del alumno es: " + nFinal);

    }
}
