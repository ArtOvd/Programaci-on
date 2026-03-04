package PR6_3;

public class PajaroGallo extends Pajaro{
    @Override
    public String cantar() {
        return super.cantar().replace("Pajaro", "PajaroGallo") + " quiquiriqui";
    }
}
