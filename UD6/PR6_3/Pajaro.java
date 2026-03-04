package PR6_3;

public class Pajaro extends Animal{
    @Override
    public String cantar() {
        return super.cantar().replace("Animal", "Pajaro") + "pio pio";
    }
}
