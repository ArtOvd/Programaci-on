package PR6_3;

public class PajaroCarpintero extends Pajaro {
    PajaroCarpintero() {}
    @Override
    public String cantar() {
        return super.cantar().replace("Pajaro", "PajaroCarpintero") + " picomadera";
    }

}
