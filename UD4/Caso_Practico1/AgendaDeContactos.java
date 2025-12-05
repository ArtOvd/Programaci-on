package Caso_Practico1;

import java.util.Scanner;

public class AgendaDeContactos {
    static Scanner sc = new Scanner(System.in);
    static int MAX_SIZE = 100;
    static int count = 0;
    static int[] telefonos = new int[MAX_SIZE];
    static String[] nombres = new String[MAX_SIZE];
    static String[] emails = new String[MAX_SIZE];
    static int opcion;

    public static void main(String[] args) {
        do {
            mostrarMenu();
            opcion = eligirOpcion();
            switch (opcion) {
                case 1:
                    listarContactos();
                    break;
                case 2:
                    addContact();
                    count++;
                    break;
                case 3:

                case 4:

                case 5:

                case 0:
                    System.out.println("Gracias por usar nuestra Agenda de Contactos!");
                    break;
                default:
                    System.out.println("Opción no valida. Elige otra.");
            }
        } while (opcion != 0);
    }

    static void mostrarMenu() {
        System.out.println("1. Listar contactos");
        System.out.println("2. Buscar por nombre");
        System.out.println("3. Añadir contacto");
        System.out.println("4. Modificar contacto");
        System.out.println("5. Eliminar contacto");
        System.out.println("0. Salir");
    }

    static int eligirOpcion() {
        System.out.print("Elige una opcion: ");
        return sc.nextInt();
    }

    static void listarContactos() {
        // Listar Nombres:
        System.out.print("Nombres: ");
        for (int i = 0; i < count; i++) {
            System.out.print(nombres[i] + ", ");
        }
        System.out.println();
        //Listar telefonos:
        System.out.print("Teléfonos: ");
        for (int j = 0; j < telefonos.length; j++) {
            if (telefonos[j] != 0) {
                System.out.print(telefonos[j] + ", ");
            }
        }
        System.out.println();
        // Listar correos:
        System.out.print("Correos: ");
        for (int k = 0; k < emails.length; k++) {
            if (emails[k] != null) {
                System.out.print(emails[k] + ", ");
            }
        }
        System.out.println();
    }

    static String pedirNombre() {
        System.out.println("Introduce el nombre de la cuenta: ");
        String nombre =  sc.nextLine().trim();
        return  nombre;
    }

    static int pedirTelefono() {
        System.out.println("Introduce el telefono del cuenta: ");
        int telefono = Integer.parseInt(sc.nextLine().trim());
        return telefono;
    }

    static String pedirCorreo() {
        System.out.println("Introduce el email de la cuenta: ");
        String email =  sc.nextLine().trim();
        return email;
    }

    static boolean validarNombre(String nombre) {
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(nombre)) {
                System.out.println("El nombre existe. Elige otro.");
                return false;
            }
            if (nombre.isEmpty()) {
                System.out.println("No se puede guardar nombre vacío.");
                return false;
            }
        }
        return true;
    }

    static boolean validarTelefono(int telefono) {
        String tel = String.valueOf(telefono);
        for (int i = 0; i < telefonos.length; i++) {
            if (telefono == telefonos[i]) {
                System.out.println("El telefono existe. Elige otro.");
                return false;
            }
        }
        if (tel.length() != 9) {
            System.out.println("El teléfono debe tener 9 dígitos ");
            return false;
        }
        return true;
    }

    static boolean validarCorreo(String correo) {
        for (int i = 0; i < emails.length; i++) {
            if (emails[i].equals(correo)) {
                System.out.println("El correo existe. Elige otro.");
                return false;
            }
        }
        if (correo.isEmpty()) {
            System.out.println("No se puede guardar correo vacío.");
            return false;
        }

        if (!correo.contains("@") && !correo.contains(".")) {
            System.out.println("El correo debe contener \"@\" y \".\"");
            return false;
        }
        return true;
    }

    static void addContact() {
        boolean validacion = false;
        do {
            String nombre= pedirNombre();
            int telefono = pedirTelefono();
            String email = pedirCorreo();
            if (validarNombre(nombre) && validarTelefono(telefono) && validarCorreo(email)) {
                nombres[count] = nombre;
                telefonos[count] = telefono;
                emails[count] = email;
                validacion = true;
            } else {
                System.out.println("Datos introducidos incorrectos. Intentalo de nuevo");
            }
        } while (!validacion);

    }
}
