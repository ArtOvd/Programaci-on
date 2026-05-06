package SmartSafe;

public class SensorHumo extends Dispositivo implements IMantenimiento{
    public SensorHumo(int id, String modelo) {
        super(id, modelo);
    }

    @Override
    public boolean realizarTest() {
        return true;
    }
}
