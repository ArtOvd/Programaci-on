package PR6_5_Ex;

public class Entrenamiento {
    public static void main(String[] args) throws AgotadoException {
        Corredor c1 = new Corredor(50);
        for (int i = 0; i < 3; i++) {
            System.out.println("Iteración " + (i + 1));
            System.out.println("Energía inicial: " + c1.getEnergia());
            boolean agotado = false;
            while (!agotado) {
                try {
                    c1.correr();
                } catch (AgotadoException e) {
                    System.out.println(e.getMessage());
                    agotado = true;
                }
            }
            if (i == 0) {
                c1.recargarEnergia(30);
            } else if (i == 1) {
                c1.recargarEnergia(10);
            } else {
                System.out.println("Acabado.");
            }
        }


    }
}
