package Caso_Practico1;

import java.util.Scanner;

public class AgendaDeContactos {
    // VARIABLES GLOBALES
    static Scanner sc = new Scanner(System.in);
    static int MAX_SIZE = 100;
    static int count = 0;
    static int[] telefonos = new int[MAX_SIZE];
    static String[] nombres = new String[MAX_SIZE];
    static String[] emails = new String[MAX_SIZE];
    static int opcion;

    public static void main(String[] args) {
        // BUCLE PRINCIPAL DEL MENÚ
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

    // MOSTRAR EL MENÚ PRINCIPAL
    static void mostrarMenu() {
        System.out.println("1. Listar contactos");
        System.out.println("2. Buscar por nombre");
        System.out.println("3. Añadir contacto");
        System.out.println("4. Modificar contacto");
        System.out.println("5. Eliminar contacto");
        System.out.println("0. Salir");
    }

    // GUARDAR OPCIÓN DEL MENÚ
    static int eligirOpcion() {
        System.out.print("Elige una opcion: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }

    // ======================================
    // METODOS RELACIONADOS CON LA LÓGICA
    // ======================================

    // =====================
    // OPCIONES DEL MENÚ
    // =====================

    // OPCIÓN 1
    // LISTAR TODOS LOS CONTACTOS DISPONIBLES
    static void listarContactos() {
        System.out.println("===================");
        System.out.println("Lista de contactos");
        System.out.println("===================");
        for (int i = 0; i < count; i++) {
            System.out.println(nombres[i] + " # " + telefonos[i] + " : " + emails[i]);
            System.out.println("===================");
        }
    }

    // OPCIÓN 2
    // BUSCAR CONTACTO POR EL NOMBRE INTRODUCIDO
    static int buscarContacto() {
        System.out.println("=======================");
        System.out.println("Busqueda de contactos");
        System.out.println("=======================");
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

    // MOSTRAR CORREO PEDIDO POR BUSQUEDA
    static void listSingleContact(int index) {
        if (index != -1) {
            System.out.println("Contacto encontrado: " + nombres[index] + " # " + telefonos[index] + " : " + emails[index]);
            System.out.println("=======================");
        }
    }

    //OPCIÓN 3
    // GUARDAR CONTACTO COMPLETO
    static void addContact() {
        boolean validacion = false;
        System.out.println("========================");
        System.out.println("Añadir contacto nuevo");
        System.out.println("========================");
        do {
            String nombre = pedirNombre().toLowerCase().trim();
            int telefono = pedirTelefono();
            String email = pedirCorreo().toLowerCase().trim();
            if (validarNombre(nombre) && validarTelefono(telefono) && validarCorreo(email)) {
                nombres[count] = nombre;
                telefonos[count] = telefono;
                emails[count] = email;
                System.out.println("\n Datos se han guardado correctamente! \n");
                validacion = true;
                count++;
            } else {
                System.out.println("Datos introducidos son incorrectos. Intentalo de nuevo");
            }
        } while (!validacion);
    }

    // OPICÓN 4
    // MODIFICAR CONTACTO EXISTENTE
    static void modificarContacto() {
        System.out.println("==========================");
        System.out.println("Modificación del contacto");
        System.out.println("==========================");
        int index = buscarContacto();
        boolean validacion = false;
        if (index != -1) {
            System.out.println("Contacto encontrado: " + nombres[index] + " # " + telefonos[index] + " : " + emails[index]);
            System.out.print("Quieres cambiarlo? (sí/no)");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("sí")) {
                do {
                    String newName = pedirNombre().toLowerCase().trim();
                    int newPhone = pedirTelefono();
                    String newEmail = pedirCorreo().toLowerCase().trim();
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
                System.out.print("Nuevo contacto: " + nombres[index] + " # " + telefonos[index] + " : " + emails[index]);
                System.out.println();
            }
        }
    }

    // OPCIÓN 5
    // ELIMINAR CONTACTO EXISTENTE
    static void eliminarContacto() {
        System.out.println("==========================");
        System.out.println("Eliminación de contactos");
        System.out.println("==========================");
        int index = buscarContacto();
        if (index != -1) {
            System.out.println("Contacto encontrado: " + nombres[index] + " # " + telefonos[index] + " : " + emails[index]);
            System.out.print("Quieres eliminarlo? (sí/no)");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("sí")) {
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
    }

    // ===========================================
    // METODOS ADICIONALES PARA OPCIONES DEL MENÚ
    // ===========================================

    // 3 METODOS PARA PETICIÓN DE DATOS

    // PEDIR NOMBRE
    static String pedirNombre() {
        System.out.print("Introduce el nombre de la cuenta: ");
        String nombre = sc.nextLine();
        return nombre;
    }

    // PEDIR TELEFONO
    static int pedirTelefono() {
        System.out.print("Introduce el telefono de la cuenta: ");
        int telefono = Integer.parseInt(sc.next());
        sc.nextLine();
        return telefono;
    }

    // PEDIR CORREO
    static String pedirCorreo() {
        System.out.print("Introduce el email de la cuenta: ");
        String email = sc.nextLine();
        return email;
    }

    // 3 METODOS DE VALIDACIÓN DE DATOS INTRODUCIDOS

    // VALIDAR NOMBRE
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

    // VALIDAR TELEFONO
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

    // VALIDAR CORREO
    static boolean validarCorreo(String correo) {
        for (int i = 0; i < count; i++) {
            if (emails[i].equals(correo)) {
                return false;
            }
        }
        if (correo.isEmpty()) {
            return false;
        }
        if (!correo.contains("@") || !correo.contains(".")) {
            return false;
        }
        return true;
    }

    // COMPROBACIÓN DEL CONTADOR PARA EL MENÚ
    static boolean comprobarContador(int count) {
        if (count < 1) {
            System.out.println("Todavía no hay contactos disponibles. Elige otra opción.");
            return false;
        } else {
            return true;
        }
    }
}
