package PR6_5_Ex;

public class Validador {
    public static void validar(String pass) throws PasswordInseguraException{
        boolean numero = false;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))) {
                numero = true;
                break;
            }
        }
        boolean mayus = false;
        boolean minus = false;
        boolean formato = false;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isUpperCase(pass.charAt(i))) {
                mayus = true;
            }
            if (Character.isLowerCase(pass.charAt(i))) {
                minus = true;
            }
            if (mayus && minus) {
                formato = true;
                break;
            }
        }
        if (!formato) {
            throw new PasswordInseguraException("La contraseña debe contener al menos una letra mayúscula y una minúscula");
        }
        if (!numero) {
            throw new PasswordInseguraException("La contraseña debe tener al menos un número");
        }
        if (pass.length() <= 8) {
            throw new PasswordInseguraException("La contraseña es demasiado corta.");
        }
    }
}
