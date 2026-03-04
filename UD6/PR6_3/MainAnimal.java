package PR6_3;

public class MainAnimal {
    static void main(String[] args) {
        Animal animal = new Animal();
        PajaroCarpintero pajaroCarpintero = new PajaroCarpintero();
        Pajaro pajaro = new Pajaro();
        PajaroGallo pajaroGallo = new PajaroGallo();
        Pez pez = new Pez();
        PezPayaso pezPayaso = new PezPayaso();
        PezEspada pezEspada = new PezEspada();
        System.out.println(animal.cantar());
        System.out.println(pajaro.cantar());
        System.out.println(pajaroCarpintero.cantar());
        System.out.println(pajaroGallo.cantar());
        System.out.println(pez.cantar());
        System.out.println(pezPayaso.cantar());
        System.out.println(pezEspada.cantar());

    }


}
