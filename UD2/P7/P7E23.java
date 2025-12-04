package P7;

import java.util.Scanner;

public class P7E23 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        double cuotaBase = 200;
        boolean socio = false;

        System.out.print("Indica su edad: ");
        int edad = leer.nextInt();
        double cuotaFinal = cuotaBase;
        if (edad > 65) {
            cuotaFinal = cuotaBase - (cuotaBase * 0.5);
        } else if (edad < 18){
            System.out.print("Alguno de tus padres es socio? ");
            String respuesta = leer.next();

            if (respuesta.equals("Si")) {
                    socio = true;
                }
            if (socio == true) {
                    cuotaFinal = cuotaBase - (cuotaBase * 0.35);
            } else {
                    cuotaFinal = cuotaBase - (cuotaBase * 0.25);
            }
        } 
        System.out.println("Su cuota anual es: " + cuotaFinal);
    }
    

    

}
