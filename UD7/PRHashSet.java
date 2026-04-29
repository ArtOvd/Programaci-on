import java.util.*;

public class PRHashSet {

    public static void main(String[] args) {
        // EJ 1:
        Set<String> set = new HashSet<String>();
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            String invitado = sc.nextLine();
//            if (invitado.equalsIgnoreCase("fin")) {
//                break;
//            }
//            set.add(invitado);
//        }
//        System.out.println(set);

        // EJ 2:
//        ArrayList<Integer> lista = new ArrayList<>();
//        for  (int i = 0; i < 20; i++) {
//            lista.add((int) (Math.random() * 100) + 1);
//        }
//        System.out.println(lista);
//        Set<Integer> set = new HashSet<>(lista);
//        System.out.println(set);
//        System.out.println("Longitud: " + set.size());

        // EJ 3:
        Scanner sc = new Scanner(System.in);
        String cadena =  sc.nextLine().toLowerCase();
        Set<String> palabras = new HashSet<>(List.of(cadena.split(" ")));
        System.out.println(palabras);
    }

}
