package StarWars;

import java.util.ArrayList;

public class MainStarWars {

    public static void main(String[] args) {
        Maestro leon = new Jedi("LEON", 20, 7);
        Maestro zack = new Sith("ZACK", 20, 8);
        System.out.println(leon);
        System.out.println(zack);
        for(int i = 1; i <= 3; i++){
            System.out.println("### TURNO " + i);
            leon.atacar(zack);
            zack.atacar(leon);
            System.out.println(leon);
            System.out.println(zack);
        }
    }
}
