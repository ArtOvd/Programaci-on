package AgendaDeContactos;

public class Agenda {
    static final int maxSize = 100;
    static int contactCount = 0;
    static Contacto[] contactos =  new Contacto[maxSize];

    //OPCIÓN 1:
    public static void listContacts() {
        if (contactCount > 0) {
            System.out.println("----------------------------------");
            System.out.println("|       LISTA DE CONTACTOS       |");
            System.out.println("----------------------------------");
            for (int i = 0; i < contactCount; i++) {
                System.out.println("Contacto " + (i + 1) + ":");
                System.out.println(contactos[i].toString());
                System.out.println("----------------------------------");
            }
        } else {
            System.out.println("Todavía no hay ningún contacto guardado.");
        }
    }

    //OPCIÓN 2:
    public static void addContact(Contacto contacto) {
        if (contactCount < maxSize) {
            System.out.println("----------------------------------");
            System.out.println("|         AÑADIR CONTACTO        |");
            System.out.println("----------------------------------");
            contactos[contactCount] = contacto;
            contactCount++;
        } else {
            System.out.println("No se puede añadir más contactos.");
        }
    }

    //OPCIÓN 3:



}
