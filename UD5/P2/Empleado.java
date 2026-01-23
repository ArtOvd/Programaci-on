package P2;

public class Empleado {
    private String nombreCompleto;
    private int permanencia;
    private double salario;

    public Empleado() {};

    public Empleado(String nombreCompleto, int permanencia, double salario) {
            setNombreCompleto(nombreCompleto);
            setPermanencia(permanencia);
            setSalario(salario);
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getPermanencia() {
        return permanencia;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setPermanencia(int permanencia) {
        this.permanencia = permanencia;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarPermanencia() {
        if (permanencia <= 3) {
            System.out.println("Junior");
        } else if (permanencia <= 18) {
            System.out.println("Middle");
        } else {
            System.out.println("Senior");
        }
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombreCompleto() + "\n");
        System.out.print("Permanencia: ");
        mostrarPermanencia();
        System.out.println();
        System.out.println("Salario: " + getSalario() + "\n");
    }

    public void aumentarSalario(int porcentaje) {
         this.salario = salario + (salario * ((double) porcentaje / 100));
    }
}
