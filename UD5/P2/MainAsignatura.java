package P2;

public class MainAsignatura {

    static void main(String[] args) {

        Asignatura asignatura1 = new Asignatura("Matemáticas", "001", "4ESO");
        Asignatura asignatura2 = new Asignatura("Inglés", "002", "4ESO");
        Asignatura asignatura3 = new Asignatura("Historia", "003", "4ESO");
        asignatura1.mostrar();
        asignatura2.mostrar();
        asignatura3.mostrar();
    }

}
