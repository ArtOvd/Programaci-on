package SmartSafe;

public class CamaraSeguridad extends Dispositivo implements IMantenimiento, IActivable {

    public CamaraSeguridad(int id, String modelo) {
        super(id, modelo);
    }

    @Override
    public void encender() {
        System.out.println("Cámara grabando...");
    }

    @Override
    public void apagar() {
        System.out.println("Cámara apagado...");
    }

    @Override
    public boolean realizarTest() {
        return Math.random() > 0.1;
    }
}
