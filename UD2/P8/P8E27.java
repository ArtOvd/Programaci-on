import java.util.Scanner;

public class P8E27 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce la cantidad de dinero: ");
        int euros = leer.nextInt();
        int bil500 = 0;
        int bil200 = 0;
        int bil100 = 0;
        int bil50 = 0;
        int bil20 = 0;
        int bil10 = 0;
        int bil5 = 0;
        int mon2 = 0;
        int mon1 = 0;
        while (euros > 0) {
            if (euros >= 500) {
                euros -= 500;
                bil500++;
            } else if (euros >= 200) {
                euros -= 200;
                bil200++;
            } else if (euros >= 100) {
                euros -= 100;
                bil100++;
            } else if (euros >= 50) {
                euros -= 50;
                bil50++;
            } else if (euros >= 20) {
                euros -= 20;
                bil20++;
            } else if (euros >= 10) {
                euros -= 10;
                bil10++;
            } else if (euros >= 5) {
                euros -= 5;
                bil5++;
            } else if (euros >= 2) {
                euros -= 2;
                mon2++;
            } else if (euros >= 1) {
                euros -= 1;
                mon1++;
            }
        }
        System.out.println("Billetes de 500: " + bil500);
        System.out.println("Billetes de 200: " + bil200);
        System.out.println("Billetes de 100: " + bil100);
        System.out.println("Billetes de 50: " + bil50);
        System.out.println("Billetes de 20: " + bil20);
        System.out.println("Billetes de 10: " + bil10);
        System.out.println("Billetes de 5: " + bil5);
        System.out.println("Monedas de 2: " + mon2); 
        System.out.println("Monedas de 1: " + mon1);

    }

}
