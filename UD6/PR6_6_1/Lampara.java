package PR6_6_1;

public class Lampara implements IEncendible {
    int watios;
    public Lampara(int watios) {
        this.watios = watios;
    }

    @Override
    public void encender() {
        System.out.println("La luz de la lámpara se enciende.");
    }

    @Override
    public void apagar() {
        System.out.println("La luz de la lámpara se apaga.");
    }
}

