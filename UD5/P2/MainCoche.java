package P2;

public class MainCoche {

    public static void main(String[] args) {

        Coche coche1 = new Coche("Volvo S60", "Gris", true, true, "UTILITARIO",2023, "TODO_RIESGO");
        Coche coche2 = new Coche("Porsche Panamera", "Verde", true, true, "UTILITARIO",2024, "TODO_RIESGO");
        Coche coche3 = new Coche("Mercedes GLE450", "Azul", true, true, "ыгы",2024, "TODO_RIESGO");
        coche1.mostrar();
        coche2.mostrar();
        coche3.mostrar();
    }

}
