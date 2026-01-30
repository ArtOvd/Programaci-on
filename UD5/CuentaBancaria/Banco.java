package CuentaBancaria;

import java.util.ArrayList;

public class Banco {
    static ArrayList<Cuenta> cuentas = new ArrayList<>();

    public static void verCuentas() {
        if (!cuentas.isEmpty()) {
            System.out.println("========== LISTA DE CLIENTES ===========");
            for (int i = 0; i < cuentas.size(); i++) {
                Cuenta cuenta = cuentas.get(i);
                System.out.println("Cuenta " + (i + 1) + ":");
                System.out.print("Nombre completo: " + cuenta.getCliente().getNombre());
                System.out.print(" " + cuenta.getCliente().getApellido());
                System.out.println(" | Saldo: " + cuenta.getSaldo() + "€");
                System.out.println("----------------------------------------");
            }
        } else {
            System.out.println("Todavía no hay ningúna cuenta para mostrar.");
        }
    }

    public static void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public static void eliminarCuenta(Cuenta cuenta) {
        cuentas.remove(cuenta);
    }

    public static void buscarCuenta(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < Banco.cuentas.size(); i++) {
            if (Banco.cuentas.get(i).getCliente().getNombre().toLowerCase().contains(nombre) || Banco.cuentas.get(i).getCliente().getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Cuenta " + (i + 1) + ":");
                System.out.print("Nombre completo: " + Banco.cuentas.get(i).getCliente().getNombre());
                System.out.print(" " + Banco.cuentas.get(i).getCliente().getApellido());
                System.out.println(" | Saldo: " + Banco.cuentas.get(i).getSaldo() + "€");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay cuentas con ese nombre.");
        }
    }

    public static void mostrarMorosos() {
        int count = 0;
        if (!cuentas.isEmpty()) {
            for (int i = 0; i < Banco.cuentas.size(); i++) {
                if (Banco.cuentas.get(i).getSaldo() < 0) {
                    System.out.println("Cuenta " + (i + 1) + ":");
                    System.out.print("Nombre: " + Banco.cuentas.get(i).getCliente().getNombre());
                    System.out.print(" " + Banco.cuentas.get(i).getCliente().getApellido());
                    System.out.println(" | Saldo: " + Banco.cuentas.get(i).getSaldo());
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("No hay cuentas con saldo negativo.");
            }
        } else {
            System.out.println("Todavía no hay ningúna cuenta para verificar.");
        }
    }

    public static void ingresarDinero(String nombre, double cantidad) {
        for (int i = 0; i < Banco.cuentas.size(); i++) {
            if (Banco.cuentas.get(i).getCliente().getNombre().equalsIgnoreCase(nombre)) {
                double saldoActual = Banco.cuentas.get(i).getSaldo();
                cuentas.get(i).setSaldo(saldoActual + cantidad);
                break;
            }
        }
    }

    public static boolean retirarDinero(String nombre, double cantidad) {
        for (int i = 0; i < Banco.cuentas.size(); i++) {
            Cuenta cuenta = Banco.cuentas.get(i);
            if (cuenta.getCliente().getNombre().equalsIgnoreCase(nombre)) {
                double saldoActual = cuenta.getSaldo();
                if (saldoActual - cantidad < -100) {
                    return false;
                }
                cuenta.setSaldo(saldoActual - cantidad);
                return true;
            }
        }
        return false;
    }

    public static void transferirDinero(String enviador, String receptor, double cantidad) {

    }
}