package GELoL;

public class MainLoL {
    public static void main(String[] args) throws Exception {
        try {
            EquipoLoL eq1 = new EquipoLoL("equipo1");
            eq1.ficharJugador("s");
            eq1.expulsarJugador("s");
            eq1.jugar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
