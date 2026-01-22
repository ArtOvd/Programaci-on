package P1;

import java.util.Scanner;

public class MainPersona {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona persona1 = new Persona("11111111R", "Artem", "Ovdiienko", 19);
        Persona persona2 = new Persona("22222222", "Vlad", "Vlados", 14);
        persona1.imprimirDatos();
//        System.out.println(persona1.esMayorDeEdad());
//        System.out.println(persona1.esJubilado());
        persona2.imprimirDatos();
//        System.out.println(persona2.esMayorDeEdad());
//        System.out.println(persona2.esJubilado());
//        System.out.println("La diferencia de edad es: " + persona1.diferenciaEdad(persona2));
    }

}
