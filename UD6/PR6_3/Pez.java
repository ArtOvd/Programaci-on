package PR6_3;

public class Pez extends Animal {

    @Override
    public String cantar() {
        return super.cantar().replace("Animal", "Pez") + "glu glu";
    }

}
