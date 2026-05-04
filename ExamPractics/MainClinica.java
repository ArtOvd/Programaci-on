public class MainClinica {

    public static void main(String[] args) {
        GestionClinica gc = new GestionClinica();
        gc.registrarPaciente("Artem");
        gc.registrarPaciente("Maria");
        gc.registrarPaciente("Pedro");
        gc.registrarPaciente("Jose");
        try {
            gc.verListaEspera();
            gc.siguientePaciente();
            gc.siguientePaciente();
            gc.verListaEspera();
            gc.siguientePaciente();
            gc.siguientePaciente();
            gc.siguientePaciente();
            gc.verListaEspera();
        } catch (ColaVaciaException e) {
            System.out.println(e.getMessage());
        }

    }
}
