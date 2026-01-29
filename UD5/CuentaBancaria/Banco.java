package CuentaBancaria;

import java.util.ArrayList;

public class Banco {
    static ArrayList<Cuenta> cuentas =  new ArrayList<>();


    public static void verCuentas() {
        if (!cuentas.isEmpty()) {
            System.out.println("========== LISTA DE CLIENTES ===========");
            for (int i = 0; i < cuentas.size(); i++) {
                Cuenta cuenta = cuentas.get(i);
                System.out.println("Cliente " + (i + 1) + ":");
                System.out.print("Nombre: " + cuenta.getCliente().getNombre());
                System.out.print(" " + cuenta.getCliente().getApellido());
                System.out.println(" | Saldo: " + cuenta.getSaldo() + "€");
                System.out.println("----------------------------------------");
            }
        } else {
            System.out.println("Todavía no hay ningún cliente para mostrar.");
        }
    }

    public static void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }
}
