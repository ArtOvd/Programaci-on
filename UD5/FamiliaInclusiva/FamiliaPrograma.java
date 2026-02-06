package FamiliaInclusiva;

public class FamiliaPrograma {

    public static void main(String[] args) {

        Persona ned = new Persona("Ned", "Stark", 50);
        Persona cat = new Persona("Catelyn", "Tully", 45);
        Persona rob = new Persona("Rob", "Stark", 30);
        Persona jon = new Persona("Jon", "Snow", 28);
        Persona sansa = new Persona("Sansa", "Stark", 20);

        ned.setConyuge(cat);
        ned.addHijo(rob);
        ned.addHijo(jon);
        cat.addHijo(rob);
        cat.addHijo(jon);
        sansa.addHermano(rob);

        ned.printInfoFamilia();
        cat.printInfoFamilia();
        rob.printInfoFamilia();
        jon.printInfoFamilia();
        sansa.printInfoFamilia();

    }

}
