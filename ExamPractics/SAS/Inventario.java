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
        equipos.forEach((serial, dispositivo) -> {
        dispositivo.encender();
        });
    }

}
