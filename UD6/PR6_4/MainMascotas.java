package PR6_4;

import java.util.ArrayList;

public class MainMascotas {

    public static void main(String[] args) {
        ArrayList<Mascota> mascotas = new ArrayList<>();
        mascotas.add(new Perro("Biba", 10, false));
        mascotas.add(new Perro("Golovach", 25, false));
        mascotas.add(new Gato("Mops", 5, "negro"));
        mascotas.add(new Gato("Buba", 8, "blanco"));
        mascotas.add(new Canario("Chiki", 3, true));
        mascotas.add(new Canario("Briki", 2, true));

        for (Mascota mascota : mascotas) {
            mascota.habla();
            mascota.cumpleaños();
            System.out.println(mascota.toString());
        }

    }

}
