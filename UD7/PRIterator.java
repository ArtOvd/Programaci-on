import PR6_1.Alumno;

import java.util.ArrayList;
import java.util.Iterator;

public class PRIterator {

     public static void main(String[] args) {
         // EJ1:
//         ArrayList<String> nombres = new ArrayList<String>();
//         nombres.add("Artem");
//         nombres.add("Pablo");
//         nombres.add("Vlad");
//         nombres.add("Nela");
//         nombres.add("Samuel");
//         nombres.add("Victor");
//         nombres.add("Alejandro");
//         nombres.add("Pedro");
//         nombres.add("Raul");
//         nombres.add("Lio");
//
//         Iterator<String> it = nombres.iterator();
//         while(it.hasNext()){
//             System.out.println(it.next());
//         }


         // EJ2:
//         ArrayList<Integer> lista = new ArrayList<>();
//         lista.add(5);
//         lista.add(4);
//         lista.add(3);
//         lista.add(7);
//         lista.add(9);
//
//         Iterator<Integer> it = lista.iterator();
//         while (it.hasNext()) {
//             if (it.next() < 5) {
//                it.remove();
//             }
//         }
//         for (Integer i : lista) {
//             System.out.println(i);
//         }

         // EJ3:
         class Alumno {
             private String nombre;
             private int nota;
             public Alumno(String nombre, int nota) {
                 this.nombre = nombre;
                 this.nota = nota;
             }
             public String getNombre() {
                 return nombre;
             }
             public int getNota() {
                 return nota;
             }
             public void setNombre(String nombre) {
                 this.nombre = nombre;
             }
             public void setNota(int nota) {
                 this.nota = nota;
             }
         }

         ArrayList<Alumno> alumnos = new ArrayList<>();
         alumnos.add(new Alumno("Maria", 1));
         alumnos.add(new Alumno("Vlad", 4));
         alumnos.add(new Alumno("Artem", 9));
         alumnos.add(new Alumno("Pablo", 6));
         alumnos.add(new Alumno("Juan", 3));
         Iterator<Alumno> it = alumnos.iterator();
         while (it.hasNext()) {
             Alumno a = it.next();
                 if (a.getNota() == 4) {
                     a.setNota(5);
                 } else if (a.getNota() < 4) {
                     it.remove();
                 }
             }
         for (Alumno a : alumnos) {
             System.out.println(a.getNombre() + " " +  a.getNota());
         }
    }
}
