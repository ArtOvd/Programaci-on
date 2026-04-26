import java.util.*;

public class PRFIFO {

    public static void main(String[] args) {
        // EJ 1:
//        Queue<String> cola = new LinkedList<>(List.of("Artem", "Pablo", "Nela", "Samuel", "Alejandro"));
//        cola.poll();
//        cola.poll();
//        System.out.println(cola);
//            System.out.println("Siguiente para atender: " + cola.peek());
//        cola.add("Lio");
//        System.out.println(cola);

        //EJ 2:
//        class Documento {
//            private String nombre;
//            private int cantidadPaginas;
//            Documento(String nombre, int cantidadPaginas) {
//                this.nombre = nombre;
//                this.cantidadPaginas = cantidadPaginas;
//            }
//            public String getNombre() {
//                return nombre;
//            }
//            public int getCantidadPaginas() {
//                return cantidadPaginas;
//            }
//        }
//
//        Documento documento1 = new Documento("LM", 1);
//        Documento documento2 = new Documento("ED", 2);
//        Documento documento3 = new Documento("PR", 5);
//        Queue<Documento> documentos = new LinkedList<>(List.of(documento1, documento2, documento3));
//        while (!documentos.isEmpty()) {
//            Documento documento = documentos.poll();
//            System.out.println("Se imprime: " +  documento.getNombre());
//            System.out.println("Tiempo a esperar: " + documento.getCantidadPaginas());
//            try {
//                Thread.sleep(documento.getCantidadPaginas() * 1000L);
//            }  catch (InterruptedException e) {
//                System.out.println("Error.");
//            }
//        }
//        System.out.println("Se imprimió todo.");
        // EJ 3:
        class Proceso {
            private String nom;
            private int time;

            Proceso(String nom, int time) {
                this.nom = nom;
                this.time = time;
            }

            public String getNom() {
                return nom;
            }
            public int getTime() {
                return time;
            }
            public void setTime(int time) {
                this.time = time;
            }
        }
        Proceso p1 =  new Proceso("Twitch", 10);
        Proceso p2 = new Proceso("YouTube", 5);
        Proceso p3 = new Proceso("ItelijIDEA", 7);
        Proceso p4 = new Proceso("Spotify", 8);
        Queue<Proceso> queue = new LinkedList<>(List.of(p1, p2, p3, p4));
        while (!queue.isEmpty()) {
            Proceso p = queue.poll();
            System.out.println("Proceso actual: " + p.getNom());
            System.out.println("Tiempò de restante: " + p.getTime());
            if (p.getTime() - 2 > 0) {
                p.setTime(p.getTime() - 2);
                queue.add(p);
            }
        }
    }
}
