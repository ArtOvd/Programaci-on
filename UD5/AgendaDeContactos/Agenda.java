package AgendaDeContactos;

public class Agenda {
    static final int maxSize = 100;
    static int contactCount = 0;
    static Contacto[] contactos = new Contacto[maxSize];

    //OPCIÓN 1:
    public static void listContacts() {
        if (contactCount > 0) {
            System.out.println("==== LISTA DE CONTACTOS ====");
            for (int i = 0; i < contactCount; i++) {
                System.out.println("Contacto " + (i + 1) + ":");
                System.out.println(contactos[i].toString());
            System.out.println("----------------------------");
            }
        } else {
            System.out.println("Todavía no hay ningún contacto guardado.");
        }
    }

    //OPCIÓN 2:
    public static void addContact(Contacto contacto) {
        if (contactCount < maxSize) {
            contactos[contactCount] = contacto;
            contactCount++;
        } else {
            System.out.println("No se puede añadir más contactos.");
        }
    }

    //OPCIÓN 3:
    public static void removeContact(int pos) {
        if (contactCount > 0) {
            for (int i = pos; i < contactCount - 1; i++) {
                contactos[i] = contactos[i + 1];
            }
            contactos[contactCount - 1] = null;
            contactCount--;
            System.out.println("Contacto eliminado correctamente.");
        } else {
            System.out.println("No hay contactos para eliminar.");
        }
    }

    //OPCIÓN 4,5,6:
    public static void listContactsBy(String texto, String criterio) {
        if (contactCount > 0) {
            boolean encontrado = false;
            String buscar = texto.toLowerCase().trim();
            System.out.println("Contactos encontrados:");
            for (int i = 0; i < contactCount; i++) {
                boolean coincide = switch (criterio) {
                    case "nombre" -> contactos[i].getNombre().toLowerCase().contains(buscar);
                    case "teléfono" -> contactos[i].getTelefono().contains(buscar);
                    case "correo" -> contactos[i].getEmail().toLowerCase().contains(buscar);
                    default -> false;
                };
                if (coincide) {
                    System.out.println("Contacto " + (i + 1) + ":\n" + contactos[i].toString());
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("No se han encontrado ningún contacto.");
            }
        } else {
            System.out.println("Todavía no hay contactos guardados.");
        }
    }

    //OPCIÓN 7:
    public static void globalContactList(String texto) {
        if (contactCount > 0) {
            boolean encontrado = false;
            String buscar = texto.toLowerCase().trim();
            System.out.println("Resultados de búsqueda global:");
            for (int i = 0; i < contactCount; i++) {
                if (contactos[i].getNombre().toLowerCase().contains(buscar) ||
                        contactos[i].getTelefono().contains(buscar) ||
                        contactos[i].getEmail().toLowerCase().contains(buscar)) {

                    System.out.println("Contacto " + (i + 1) + ":\n" + contactos[i].toString());
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("No hay contactos similares.");
            }
        } else {
            System.out.println("Todavía no hay ningún contacto.");
        }
    }


}
