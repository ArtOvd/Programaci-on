package AgendaDeContactos;

import java.util.Scanner;

public class Programa {
    static final Scanner sc = new Scanner(System.in);
    static Agenda miAgenda = new Agenda();

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Elige una opción: ");
            switch (opcion) {
                case 1:
                    Agenda.listContacts();
                    break;
                case 2:
                    uiAgregarContacto();
                    break;
                case 3:
                    uiEliminarContacto();
                    break;
                case 4:
                    uiBuscarPor("nombre");
                    break;
                case 5:
                    uiBuscarPor("teléfono");
                    break;
                case 6:
                    uiBuscarPor("correo");
                    break;
                case 7:
                    uiBusquedaGlobal();
                    break;
                case 8:
                    System.out.println("Gracias por usar el programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 8);
    }

    // metodos UI:

    private static void mostrarMenu() {
        System.out.println("\n--- AGENDA DE CONTACTOS ---");
        System.out.println("1. Ver contactos.");
        System.out.println("2. Agregar contacto.");
        System.out.println("3. Eliminar contacto.");
        System.out.println("4. Buscar por nombre.");
        System.out.println("5. Buscar por teléfono.");
        System.out.println("6. Buscar por correo.");
        System.out.println("7. Búsqueda global.");
        System.out.println("8. Salir.");
    }

    private static void uiAgregarContacto() {
        Contacto contacto;
        boolean esValido = false;
        do {
            System.out.println("--- AÑADIR CONTACTO ---");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Teléfono: ");
            String tel = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            contacto = new Contacto(nombre, tel, email);
            if (contacto.getNombre() != null && contacto.getTelefono() != null && contacto.getEmail() != null) {
                Agenda.addContact(contacto);

                System.out.println("Contacto añadido con éxito.");
                esValido = true;
            } else {
                System.out.println("Datos no válidos. Inténtalo de nuevo.");
            }
        } while (!esValido);
    }

    private static void uiEliminarContacto() {
        Agenda.listContacts();
        int pos = leerEntero("Introduce la posición del contacto a eliminar: ");
        Agenda.removeContact(pos);
    }

    private static void uiBuscarPor(String tipo) {
        System.out.print("Introduce el " + tipo + " a buscar: ");
        String texto = sc.nextLine();
        Agenda.listContactsBy(texto, tipo);
    }

    private static void uiBusquedaGlobal() {
        System.out.print("Introduce el texto para búsqueda global: ");
        String texto = sc.nextLine();
        Agenda.globalContactList(texto);
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
}