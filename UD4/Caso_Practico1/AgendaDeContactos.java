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
                    if (comprobarContador(count)) {
                        listarContactos();
                    }
                    break;
                case 2:
                    if (comprobarContador(count)) {
                        listSingleContact(buscarContacto());
                    }
                    break;
                case 3:
                    addContact();
                    break;
                case 4:
                    if (comprobarContador(count)) {
                        modificarContacto();
                    }
                    break;
                case 5:
                    if (comprobarContador(count)) {
                        eliminarContacto();
                    }
                    break;
                case 0:
                    System.out.println("Gracias por usar nuestra Agenda de Contactos!");
                    break;
                default:
                    System.out.println("Opción no valida. Elige otra.");
            }
        } while (opcion != 0);
    }

    // ==================================
    // METODOS RELACIONADOS CON UI
    // ==================================

    // Metodo para mostrar el menú principal
    static void mostrarMenu() {
        System.out.println("1. Listar contactos");
        System.out.println("2. Buscar por nombre");
        System.out.println("3. Añadir contacto");
        System.out.println("4. Modificar contacto");
        System.out.println("5. Eliminar contacto");
        System.out.println("0. Salir");
    }

    // Eligir opcion del menú
    static int eligirOpcion() {
        System.out.print("Elige una opcion: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }

    // Metodo para listar todos los contactos simultáneamente
    static void listarContactos() {
        // Listar todos contactos línea por línea:
        for (int i = 0; i < count; i++) {
            System.out.print(nombres[i] + " # " + telefonos[i] + " : " + emails[i]);
            System.out.println();
        }
    }

    // Metodo para añadir contacto después de validarlo
    static void addContact() {
        boolean validacion = false;
        do {
            String nombre = pedirNombre();
            int telefono = pedirTelefono();
            String email = pedirCorreo();
            if (validarNombre(nombre) && validarTelefono(telefono) && validarCorreo(email)) {
                nombres[count] = nombre;
                telefonos[count] = telefono;
                emails[count] = email;
                System.out.println("\n Datos se han guardado correctamente! \n");
                validacion = true;
                count++;
            } else {
                System.out.println("Datos introducidos son incorrectos. Si quieres salir - escribe \"sí\". ");
                String opcion = sc.next();
                if (opcion.equalsIgnoreCase("sí") || opcion.equalsIgnoreCase("si")) {
                    break;
                }
            }
        } while (!validacion);
    }

    // ======================================
    // METODOS RELACIONADOS CON LA LÓGICA
    // ======================================

    // 3 Metodos para pedir datos correspondientes
    static String pedirNombre() {
        System.out.print("Introduce el nombre de la cuenta: ");
        String nombre = sc.nextLine().trim();
        return nombre;
    }

    static int pedirTelefono() {
        System.out.print("Introduce el telefono de la cuenta: ");
        int telefono = Integer.parseInt(sc.next().trim());
        sc.nextLine();
        return telefono;
    }

    static String pedirCorreo() {
        System.out.print("Introduce el email de la cuenta: ");
        String email = sc.nextLine().trim();
        return email;
    }

    // 3 Metodos de validación de los datos correspondientes
    static boolean validarNombre(String nombre) {
        for (int i = 0; i < count; i++) {
            if (nombres[i].equals(nombre)) {
                return false;
            }
            if (nombre.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    static boolean validarTelefono(int telefono) {
        String tel = String.valueOf(telefono);
        for (int i = 0; i < count; i++) {
            if (telefono == telefonos[i]) {
                return false;
            }
        }
        if (tel.length() != 9) {
            return false;
        }
        return true;
    }

    static boolean validarCorreo(String correo) {
        for (int i = 0; i < count; i++) {
            if (emails[i].equals(correo)) {
                return false;
            }
        }
        if (correo.isEmpty()) {
            return false;
        }

        if (!correo.contains("@") && !correo.contains(".")) {
            return false;
        }
        return true;
    }

    // Metodo para buscar el contacto por el nombre
    static int buscarContacto() {
        do {
            System.out.print("Introduce el nombre del contacto: ");
            String entrada = sc.nextLine().toLowerCase();
            for (int i = 0; i < count; i++) {
                if (nombres[i].toLowerCase().contains(entrada) || nombres[i].toLowerCase().startsWith(entrada)) {
                    return i;
                }
            }
            System.out.println("Contacto no encontrado.");
            return -1;
        } while (true);
    }

    // Metodo para listar el contacto requerido
    static void listSingleContact(int index) {
        if (index != -1) {
            System.out.print("Contacto encontrado: " + nombres[index] + " # " + telefonos[index] + " : " + emails[index]);
            System.out.println();
        }
    }

    // Metodo para modificar contacto existente
    static void modificarContacto() {
        System.out.println("==========================");
        System.out.println("Modificación del contacto");
        System.out.println("==========================");
        int index = buscarContacto();
        boolean validacion = false;
        if (index != -1) {
            do {

                String newName = pedirNombre();
                int newPhone = pedirTelefono();
                String newEmail = pedirCorreo();
                if (validarNombre(newName) && validarTelefono(newPhone) && validarCorreo(newEmail)) {
                    nombres[index] = newName;
                    telefonos[index] = newPhone;
                    emails[index] = newEmail;
                    validacion = true;
                } else {
                    System.out.println("Datos introducidos son incorrectos. Si quieres salir - escribe \"sí\". ");
                    String opcion = sc.next();
                    if (opcion.equalsIgnoreCase("sí") || opcion.equalsIgnoreCase("si")) {
                        break;
                    }
                }
            } while (!validacion);
            System.out.print("Contacto modificado: " + nombres[index] + " # " + telefonos[index] + " : " + emails[index]);
            System.out.println();
        }

    }
    // Eliminar contacto eligido
    static void eliminarContacto() {
        int index = buscarContacto();
        if (index != -1) {
            for (int j = index; j < count - 1; j++) {
                nombres[j] = nombres[j + 1];
                telefonos[j] = telefonos[j + 1];
                emails[j] = emails[j + 1];
            }
            nombres[count - 1] = null;
            telefonos[count - 1] = 0;
            emails[count - 1] = null;
            count--;
            System.out.println("Contacto eliminado correctamente.");
        }
    }

    static boolean comprobarContador(int count) {
        if (count < 1) {
            System.out.println("Todavía no hay contactos disponibles. Elige otra opción.");
            return false;
        } else {
            return true;
        }
    }

}
