package SAS;

public abstract class Dispositivo {
    private String serialNumber;
    private String marca;

    public Dispositivo(String serialNumber, String marca) {
        setSerialNumber(serialNumber);
        setMarca(marca);
    }


    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    abstract void encender();
}
