package CuentaBancaria;

import java.util.Scanner;

public class Programa {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            System.out.print("Elige una opción: ");
            opcion = leerEntero();
            switch (opcion) {
                case 1:
                    Banco.verCuentas();
                    break;
                case 2:
                    uiIngresarDinero();
                    break;
                case 3:
                    uiRetirarDinero();
                    break;
                case 4:
                    uiTransferirDinero();
                    break;
                case 5:
                    uiAgregarCuenta();
                    break;
                case 6:
                    uiEliminarCuenta();
                    break;
                case 7:
                    uiBuscarCuenta();
                    break;
                case 8:
                    Banco.mostrarMorosos();
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
        while (!sc.hasNextInt()) {
            System.out.print("Entrada no válida. Intenta otra vez: ");
            sc.next();
            sc.nextLine();
        }
        int numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }

    public static void uiIngresarDinero() {
        if (Banco.cuentas.isEmpty()) {
            System.out.println("No hay cuentas disponibles.");
            return;
        }
        Banco.verCuentas();
        System.out.print("Elige la cuenta para realizar el ingreso (nombre): ");
        String nombre = elegirNombre();
        System.out.print("Introduce la cantidad para ingresar: ");
        double ingreso = pedirCantidad();
        Banco.ingresarDinero(nombre, ingreso);
        System.out.println("Ingreso realizado. Datos nuevos: ");
        Banco.buscarCuenta(nombre);
    }

    public static void uiRetirarDinero() {
        if (Banco.cuentas.isEmpty()) {
            System.out.println("No hay cuentas disponibles.");
            return;
        }
        Banco.verCuentas();
        System.out.print("Introduce el nombre de la cuenta para retirar: ");
        String nombre = elegirNombre();
        System.out.print("Introduce la cantidad para retirar: ");
        double cantidad = pedirCantidad();
        boolean exito = Banco.retirarDinero(nombre, cantidad);
        if (exito) {
            System.out.println("Retirada realizada con éxito. Datos nuevos: ");
            Banco.buscarCuenta(nombre);
        } else {
            System.out.println("No se puede retirar esa cantidad. El límite es -100€.");
        }
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

    public static void uiEliminarCuenta() {
        if (Banco.cuentas.isEmpty()) {
            System.out.println("Todavía  hay cuentas para eliminar.");
            return;
        }
        Banco.verCuentas();
        System.out.print("Elige el número de la cuenta para eliminar: ");
        while (true) {
            int numero = leerEntero();
            if (numero >= 0 && numero <= Banco.cuentas.size()) {
                Cuenta cuenta = Banco.cuentas.get(numero - 1);
                Banco.eliminarCuenta(cuenta);
                System.out.println("Cuenta eliminada con exito.");
                break;
            } else {
                System.out.print("Número no válido. Elige otro.");
            }
        }
    }

    public static void uiBuscarCuenta() {
        if (Banco.cuentas.isEmpty()) {
            System.out.println("Todavía hay cuentas par buscar.");
            return;
        }
        System.out.println("====== BUSQUEDA DE CUENTAS ======");
        System.out.print("Introduce el nombre del propietario: ");
        while (true) {
            String nombre = sc.nextLine().trim().toLowerCase();
            if (nombre.length() >= 2) {
                System.out.println("===== Cuentas encontradas =====");
                Banco.buscarCuenta(nombre);
                break;
            } else {
                System.out.print("Nombre no válido. Introduce otro nombre:");
            }
        }
    }

    public static void uiTransferirDinero() {
        if (Banco.cuentas.isEmpty()) {
            System.out.println("No hay cuentas para realizar la transferencia.");
            return;
        }
        System.out.print("Nombre del origen: ");
        String nombreOrigen = elegirNombre();
        System.out.print("Nombre del destino: ");
        String nombreDestino = elegirNombre();
        if (nombreOrigen.equalsIgnoreCase(nombreDestino)) {
            System.out.println("No se puede transferir dinero a la misma cuenta.");
            return;
        }
        System.out.print("Cantidad a transferir: ");
        double cantidad = pedirCantidad();
        if (Banco.transferirDinero(nombreOrigen, nombreDestino, cantidad)) {
            System.out.println("Transferencia realizada con éxito.");
            Banco.buscarCuenta(nombreOrigen);
            Banco.buscarCuenta(nombreDestino);
        } else {
            System.out.println("Saldo insuficiente (Límite de crédito -100€ excedido).");
        }
    }

    public static String elegirNombre() {
        String nombre = "";
        boolean existe = false;
        if (!Banco.cuentas.isEmpty()) {
            while (!existe) {
                nombre = sc.nextLine().trim();
                for (int i = 0; i < Banco.cuentas.size(); i++) {
                    if (Banco.cuentas.get(i).getCliente().getNombre().equalsIgnoreCase(nombre)) {
                        existe = true;
                        break;
                    }
                }
                if (!existe) {
                    System.out.print("Nombre no existe. Introduce otro: ");
                }
            }
        }
        return nombre;
    }

    public static double pedirCantidad() {
        double cantidad = 0.0;
        boolean valido = false;
        while (!valido) {
            cantidad = sc.nextDouble();
            sc.nextLine();
            if (cantidad > 0.0) {
                valido = true;
            } else {
                System.out.print("Cantidad no válida. Intenta otra vez: ");
            }
        }
        return cantidad;
    }

}
