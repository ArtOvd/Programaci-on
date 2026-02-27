package PR6_1;

import java.util.ArrayList;

public class MainPR1 {
    static void main(String[] args) {
        Persona p1 = new Persona("Artem", "Ovdiienko", "02/11/2006");
        Persona p2 = new Persona("Vlad", "Duminskiy", "08/10/2006");
        Persona p3 = new Persona("Pablo", "Lopez", "25/02/2007");
        Profesor pf1 = new Profesor("Lionel", "Tarazón", "24/05/1979", 3000, "Programación");
        Profesor pf2 = new Profesor("Pedro", "Garcia", "10/10/1975", 2500, "LM");
        Profesor pf3 = new Profesor("Raul", "Escribano", "12/03/1980", 4500, "SI");
        Alumno al1 = new Alumno("Masuel", "Galleta", "29/05/2005", "1DAM", 7);
        Alumno al2 = new Alumno("Nela", "Fazuliyanova", "12/12/2002", "1DAM", 5);
        Alumno al3 = new Alumno("Alejandro", "Rueda", "25/03/2005", "1DAM", 6);

        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(al1);
        personas.add(al2);
        personas.add(al3);
        personas.add(pf1);
        personas.add(pf2);
        personas.add(pf3);

        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }


    }


}
