package SateliteComunicaciones;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SateliteComunicaciones {
    Deque<String> colaEntrada = new LinkedList<>();
    Stack<String> historialProcesados = new Stack<>();

    public SateliteComunicaciones() {}

    public void recibirMensajes(String mensaje) throws Exception {
        if (mensaje.isEmpty()) {
            throw new Exception("El mensaje no puede estar vacío.");
        }
        colaEntrada.offer(mensaje);
    }

    public boolean procesarSiguiente() {
        if (!colaEntrada.isEmpty()) {
            String mensaje = colaEntrada.poll();
            System.out.println(mensaje);
            historialProcesados.push(mensaje);
            return true;
        } else {
            System.out.println("No hay mensajes pendientes.");
            return false;
        }
    }

    public boolean deshacerUltimo() {
        if (!historialProcesados.isEmpty()) {
            colaEntrada.addFirst(historialProcesados.pop());
            return true;
        } else {
            System.out.println("Nada que deshacer.");
            return false;
        }
    }

    public void verEstado() {
        if (!colaEntrada.isEmpty()) {
            System.out.println("Mensajes pendientes: " +  colaEntrada);
        } else {
            System.out.println("No hay mensajes para mostrar.");
        }
        if (!historialProcesados.isEmpty()) {
            System.out.println("Mensajes en procesados: " +  historialProcesados);
        } else {
            System.out.println("No hay mensajes procesados.");
        }

    }
}
