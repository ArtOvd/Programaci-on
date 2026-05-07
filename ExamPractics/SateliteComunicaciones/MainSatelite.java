package SateliteComunicaciones;

public class MainSatelite {

    public static void main(String[] args) throws Exception {
        SateliteComunicaciones sat = new SateliteComunicaciones();
        try {
            sat.recibirMensajes("algo");
            sat.recibirMensajes("Pablo loh");
            sat.recibirMensajes("Maria loh");
            sat.verEstado();
            sat.procesarSiguiente();
            sat.procesarSiguiente();
            sat.procesarSiguiente();
            sat.verEstado();
            sat.deshacerUltimo();
            sat.deshacerUltimo();
            sat.deshacerUltimo();
            sat.verEstado();
            System.out.println("------");
            /*sat.deshacerUltimo();
            sat.verEstado();
            System.out.println("------");
            sat.procesarSiguiente();
            sat.verEstado();*/
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

}
