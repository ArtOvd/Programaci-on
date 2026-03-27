package PR6_5_Ex;

public class ej22 {
    public static void main(String[] args) throws Exception {
        try {
            enviarMensaje("s@s.gh");
            enviarMensaje("");
        }catch(Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

    public static void enviarMensaje(String texto) throws Exception {
        if (texto.isEmpty()) {
            throw new Exception("El correo no puede ser vacío.");
        } else {
            if (texto.contains("@")) {
                boolean aCorrecto = false;
                boolean pCorrecto = false;
                for (int i = 0; i < texto.length() - 1; i++) {
                    if (texto.charAt(i) == '@') {
                        if (texto.charAt(i + 1) != ' ' &&  texto.charAt(i + 1) != '.') {
                            aCorrecto = true;
                        }
                    }
                    if (texto.charAt(i) == '.') {
                        if  (texto.charAt(i - 1) != ' ' && texto.charAt(i - 1) != '@'  && texto.charAt(i + 1) != ' ') {
                            pCorrecto = true;
                        }
                    }
                }
                if (aCorrecto && pCorrecto) {
                    System.out.println("El correo es válido.");
                } else {
                    throw new Exception("El correo tiene que contener algunos caracteres entre @ y . y después del .");
                }
            } else {
                throw new  Exception("El correo tiene que contener @.");
            }
        }
    }
}
