package SAS;

public class Smartphone extends Dispositivo{
    private String sistemaOperativo;

    public Smartphone(String serialNumber, String marca, String sistemaOperativo) {
        super(serialNumber,marca);
        setSistemaOperativo(sistemaOperativo);
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void encender() {
        System.out.println("Smartphone " + getMarca() + " is turning on...");
    }

}
