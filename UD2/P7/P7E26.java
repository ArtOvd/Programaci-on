package P7;

import java.util.Scanner;

public class P7E26 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Crea su login: ");
        String login = leer.next();

        System.out.print("Crea su contraseña: ");
        String pass = leer.next();

        System.out.print("Introduce el login de la cuenta: ");
        String login2 = leer.next();

        System.out.print("Introduce la contraseña de la cuenta: ");
        String pass2 = leer.next();

        if (login2.equals(login) && pass2.equals(pass)) {
            System.out.println("Sesión iniciada correctamente!");
        } else if (login2 != login && pass2.equals(pass)) {
            System.out.println("El login introducido es incorrecto");
        } else if (pass2 != pass && login2.equals(login)) {
            System.out.println("La contraseña introducida es incorrecta");
        } else {
            System.out.println("Datos introducidos son incorrectos");
        }
    }



}
