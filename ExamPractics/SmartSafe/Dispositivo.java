package SmartSafe;

public class Dispositivo {
    protected int id;
    protected String modelo;

    public Dispositivo(int id, String modelo) {
        this.id = id;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Dispositivo {" + "id=" + id + ", modelo=" + modelo + '}';
    }
}
