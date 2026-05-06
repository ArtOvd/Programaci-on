package SmartSafe;

public class LucesEmergencia extends Dispositivo implements IActivable{
    public LucesEmergencia(int id, String modelo) {
        super(id, modelo);
    }

    @Override
    public void encender() {
        System.out.println("Luces de emergencia activadas");
    }

    @Override
    public void apagar() {
        System.out.println("Luces de emergencia apagadas");
    }
}
