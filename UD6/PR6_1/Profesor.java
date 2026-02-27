package PR6_1;

public class Profesor extends Persona {
    private double salario;
    private String especialidad;
    public Profesor(String nombre, String apellido, String fechaNacim, double salario, String especialidad) {
        super(nombre, apellido, fechaNacim);
        setSalario(salario);
        setEspecialidad(especialidad);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String getNombre() {
        return "Profesor: " + nombre;
    }

    @Override
    public String toString() {
        return super.toString() + " salario: " + salario + " especialidad: " + especialidad;
    }
}
