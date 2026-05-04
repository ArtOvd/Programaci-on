package SAS;

import java.util.HashMap;
import java.util.Iterator;

public class Inventario {
    HashMap<String, Dispositivo> equipos = new HashMap<>();


    public void agregarEquipo(Dispositivo d) {
        equipos.put(d.getSerialNumber(), d);
    }

    public void buscarEquipo(String sn) throws EquipoNoEncontradoException {
        if  (!equipos.containsKey(sn)) {
            throw new EquipoNoEncontradoException("Error. Dispositivo no encontrado");
        }
        System.out.println("Equipo encontrado: " + equipos.get(sn).getMarca());
    }

    public void mostrarTodos() {
        Iterator<Dispositivo> it = equipos.values().iterator();
        while (it.hasNext()) {
            Dispositivo d = it.next();
            d.encender();
        }
    }

}
