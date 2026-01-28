package CuentaBancaria;

import java.util.ArrayList;

public class Banco {
    static ArrayList<Cliente> clientes =  new ArrayList<>();


    public static void verClientes() {
        if  (!clientes.isEmpty()) {
            System.out.println("========== LISTA DE CLIENTES ===========");
            for (int i = 0; i < clientes.size(); i++) {
                System.out.println("Cliente " + (i + 1) + ":");
                System.out.println(clientes.get(i));
            System.out.println("========================================");
            }
        } else {
            System.out.println("Todavía no hay ningún cliente para mostrar.");
        }
    }

    public static void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }
}
