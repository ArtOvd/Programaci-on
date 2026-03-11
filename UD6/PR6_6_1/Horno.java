package PR6_6_1;

public class Horno implements IEncendible{
    int potencia;
    public Horno(int potencia){
        this.potencia = potencia;
    }

    @Override
    public void encender() {
        System.out.println("El horno calienta.");
    }

    @Override
    public void apagar() {
        System.out.println("El horno deja de calentar.");
    }
}
