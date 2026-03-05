package PR6_5;

public class MainSolar {
    static void main(String[] args) {
        SistemaSolar s1 = new SistemaSolar("Solar");
        Planeta p1 = new Planeta("Tierra", 5, 24.4, 2000);
        Planeta p2 = new Planeta("Mars", 4, -30.8, 1500);
        Planeta p3 = new Planeta("Jupiter", 10, -70.8, 5000);
        Satelite st1 = new Satelite("Luna", 2, -50.4, 1000);
        Satelite st2 = new Satelite("Phobos", 1, -80.4, 1000);
        Satelite st3 = new Satelite("Titan", 4, -90.4, 2000);
        s1.addPlaneta(p1);
        s1.addPlaneta(p2);
        s1.addPlaneta(p3);
        p1.addSatelite(st1);
        p2.addSatelite(st2);
        p3.addSatelite(st3);
        s1.mostrarAstros();
        p1.mostrarAstros();
        p2.mostrarAstros();
        p3.mostrarAstros();
    }


}
