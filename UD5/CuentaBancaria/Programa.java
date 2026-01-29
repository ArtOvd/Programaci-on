package CuentaBancaria;

import java.util.Scanner;

public class Programa {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero();
            switch (opcion) {
                case 1:
                    Banco.verCuentas();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    uiAgregarCuenta();
                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                default:
                    System.out.println("Opción no válida. Elige otra.");
            }
        } while (opcion != 9);
    }

    public static void mostrarMenu() {
        System.out.println("====================== MENÚ ======================");
        System.out.println("1 - Ver cuenta.");
        System.out.println("2 - Ingresar dinero.");
        System.out.println("3 - Retirar dinero.");
        System.out.println("4 - Transferencia.");
        System.out.println("5 - Agregar cuenta.");
        System.out.println("6 - Eliminar cuenta.");
        System.out.println("7 - Buscar cuenta.");
        System.out.println("8 - Mostrar morosos.");
        System.out.println("9 - Salir.");
    }

    private static int leerEntero() {
        System.out.print("Elige una opción: ");
        while (!sc.hasNextInt()) {
            System.out.print("Entrada no válida. Intenta otra vez: ");
            sc.next();
            sc.nextLine();
        }
        int numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }

    public static void uiAgregarCuenta() {
        System.out.println("====== AGREGAR CUENTA ======");
        String nombre, apellido;
        while (true) {
            System.out.print("Nombre: ");
            nombre = sc.nextLine().trim();
            System.out.print("Apellido: ");
            apellido = sc.nextLine().trim();

            if (nombre.length() >= 2 && apellido.length() >= 2) {
                break;
            }
            System.out.println("Datos inválidos (mínimo 2 caracteres). Intenta de nuevo.");
        }

        boolean yaExiste = false;
        for (int i = 0; i < Banco.cuentas.size(); i++) {
            if (Banco.cuentas.get(i).getCliente().getNombre().equals(nombre) && Banco.cuentas.get(i).getCliente().getApellido().equals(apellido)) {
                yaExiste = true;
                break;
            }
        }
        if (yaExiste) {
            System.out.println("Error: El cliente ya tiene una cuenta en este banco.");
        } else {
            Cliente nuevoCliente = new Cliente(nombre, apellido);
            Cuenta nuevaCuenta = new Cuenta(nuevoCliente);
            Banco.agregarCuenta(nuevaCuenta);
            System.out.println("Cuenta creada con éxito.");
        }


    }

}
