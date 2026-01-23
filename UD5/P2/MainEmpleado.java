package P2;

public class MainEmpleado {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Artem Ovdiienko", 20, 6000.00);
        empleado1.mostrarDatos();
        empleado1.aumentarSalario(20);
        empleado1.mostrarDatos();
    }

}
