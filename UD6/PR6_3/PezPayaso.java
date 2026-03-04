package PR6_3;

public class PezPayaso extends Pez{
    @Override
    public String cantar() {
        return super.cantar().replace("Pez", "Pezpayaso") + " chorprecha";
    }
}
