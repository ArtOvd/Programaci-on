package P6;
import java.util.Scanner;
public class P6E2 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Dame un lado: ");
        int lado = leer.nextInt();
        int perimetro = lado * 3;
        double altura = ((double) Math.sqrt(3) * lado) / 2;
        double area = (lado * altura) / 2;
    
        System.out.println("Perímetro = " + perimetro + "\n" + "Área = " + area);
    }
}

