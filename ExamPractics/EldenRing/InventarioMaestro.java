package EldenRing;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class InventarioMaestro {
    private HashMap<String, Arma> armas;

    public InventarioMaestro() {
        armas = new HashMap<>();
    }

    public boolean registrarArma(String codigo, Arma a) {
        if  (armas.containsKey(codigo)) {
            System.out.println("Código repetido.");
            return false;
        }
        armas.put(codigo, a);
        System.out.println("Arma añadida con éxito.");
        return true;
    }

    public boolean mejorarArma(String codigo, int puntos) {
        if (armas.containsKey(codigo)) {
            Arma a = armas.get(codigo);
            a.setAtaque(a.getAtaque() + puntos);
            armas.put(codigo, a);
            System.out.println("Arma mejorada.");
            return true;
        } else {
            System.out.println("Arma no encontrada.");
            return false;
        }
    }

    public boolean mostrarArmasDanadas() {
        AtomicInteger count = new AtomicInteger();
        armas.forEach((codigo, a) -> {
            if (a.getDurabilidad() < 0.2) {
                System.out.println(a.getNombre());
                count.getAndIncrement();
            }
        });
        if (count.get() > 0) {
            return true;
        } else {
            System.out.println("No hay armas dañadas.");
            return false;
        }
    }

    public boolean eliminarArma(String codigo) {
        if (armas.containsKey(codigo)) {
            armas.remove(codigo);
            System.out.println("Arma eliminada.");
            return true;
        } else {
            System.out.println("Arma no encontrada.");
            return false;
        }
    }
}
