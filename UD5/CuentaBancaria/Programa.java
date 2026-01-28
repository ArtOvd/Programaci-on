package CuentaBancaria;

import java.util.Scanner;

public class Programa {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Elige una opción: ");
            switch (opcion) {
                case 1:
                    Banco.verClientes();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 11:

                    break;
                case 12:

                    break;
                default:
                    System.out.println("Opción no válida. Elige otra.");
            }
        } while (opcion != 0);


    }

    public static void mostrarMenu() {
        System.out.println("====================== MENÚ ======================");
        System.out.println("01 - Ver clientes.");
        System.out.println("02 - Ingresar dinero.");
        System.out.println("03 - Retirar dinero.");
        System.out.println("04 - Transferencia.");
        System.out.println("05 - Agregar cliente.");
        System.out.println("06 - Eliminar cliente.");
        System.out.println("07 - Agregar cuenta a cliente");
        System.out.println("08 - Eliminar cuenta de cliente.");
        System.out.println("09 - Mostrar cuenta de cliente.");
        System.out.println("10 - Mostrar movimientos de cuenta de cliente.");
        System.out.println("11 - Buscar cuenta.");
        System.out.println("12 - Mostrar morosos.");
        System.out.println("00 - Salir.");
    }


    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextInt()) {
            System.out.print("Error. Introduce un número válido: ");
            sc.next();
            sc.nextLine();
        }
        int numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }

    public static void uiAddClient() {
        Cliente cliente;
        boolean esValido = false;
        boolean existe = false;
        String nombre = "", apellido = "", direccion, localidad;
        do {
            System.out.println("====== AÑADIR CLIENTE ======");
            while (!existe) {
                System.out.print("Nombre: ");
                nombre = sc.nextLine();
                System.out.print("Apellido: ");
                apellido = sc.nextLine();
                for (int i = 0; i < Banco.clientes.size(); i++) {
                    if (Banco.clientes.get(i).getNombre().equals(nombre) &&  Banco.clientes.get(i).getApellido().equals(apellido)) {
                        System.out.println("No se puede añadir el mismo cliente.");
                        existe = true;
                        break;
                    }
                }
            }
            System.out.print("Direccion: ");
            direccion = sc.nextLine();
            System.out.print("Localidad: ");
            localidad = sc.nextLine();
            cliente = new Cliente(nombre, apellido, direccion, localidad);
            if (cliente.getNombre() != null && cliente.getApellido() != null &&
                cliente.getDireccion() != null && cliente.getLocalidad() != null && !existe) {
                Banco.addCliente(cliente);
                System.out.println("Cliente añadido con exito.");
                esValido = true;
            } else {
                System.out.println("Datos introducidos no válidos.");
            }

        }while(!esValido);

    }

}
