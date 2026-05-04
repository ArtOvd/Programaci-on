import java.util.Stack;

public static class Historial {
    Stack<String> links = new Stack<>();

    public void visitar(String link) {
        links.push(link);
    }

    public void retroceder() throws HistorialVacioException {
        if (links.isEmpty()) {
            throw new HistorialVacioException("Error. Historial vacío.");
        }
        System.out.println(links.pop());
    }
}

static class HistorialVacioException extends Exception {
    public HistorialVacioException(String mensaje) {
        super(mensaje);
    }
}

public static void main(String[] args) {
    Historial historial = new Historial();
    historial.visitar("https://www.google.com");
    historial.visitar("https://www.youtube.com/");
    historial.visitar("https://www.amazon.com/");
    try {
        historial.retroceder();
        historial.retroceder();
        historial.retroceder();
        historial.retroceder();
    } catch (HistorialVacioException e) {
        System.out.println(e.getMessage());

    }

}