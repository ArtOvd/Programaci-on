package SAS;

public class Laptop extends Dispositivo {
    private int ram;

    public Laptop(String serialNumber, String marca, int ram) {
        super(serialNumber,marca);
        setRam(ram);
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void encender() {
        System.out.println("Laptop " + getMarca() + " with " + getRam()+ " is turning on...");
    }
}
