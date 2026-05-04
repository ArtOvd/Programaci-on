import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class GestionClinica {
    private Queue<String> pacientes = new LinkedList<>();


    public void registrarPaciente(String nombre) {
        pacientes.add(nombre);
    }

    public String siguientePaciente() throws ColaVaciaException {
        if (pacientes.isEmpty()) {
            throw new ColaVaciaException("Error. Cola vacia");
        }
        return pacientes.remove();
    }

    public void verListaEspera() {
        Iterator<String> it = pacientes.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
