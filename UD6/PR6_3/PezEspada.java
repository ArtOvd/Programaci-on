package PR6_3;

public class PezEspada extends Pez {
    @Override
    public String cantar() {
        return super.cantar().replace("Pez", "PezEspada") + " rindete";
    }
}
