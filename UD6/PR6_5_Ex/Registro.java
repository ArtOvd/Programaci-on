package PR6_5_Ex;

import java.util.Scanner;

public class Registro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("Contraseña: ");
                String pass = sc.nextLine();
                Validador.validar(pass);
                break;
            } catch (PasswordInseguraException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
