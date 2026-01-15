package P1;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("DNI de Persona 1: ");
        String dni1 = sc.nextLine();
        System.out.print("Nombre de Persona 1: ");
        String nombre1 = sc.nextLine();
        System.out.print("Apellido de Persona 1: ");
        String apellido1 = sc.nextLine();
        System.out.print("Edad de persona 1: ");
        int edad1 = sc.nextInt();
        sc.nextLine();
        Persona persona1 = new Persona(dni1, nombre1, apellido1, edad1);

        System.out.print("DNI de Persona 2: ");
        String dni2 = sc.nextLine();
        System.out.print("Nombre de Persona 2: ");
        String nombre2 = sc.nextLine();
        System.out.print("Apellido de Persona 2: ");
        String apellido2 = sc.nextLine();
        System.out.print("Edad de persona 2: ");
        int edad2 = sc.nextInt();
        sc.nextLine();
        Persona persona2 = new Persona(dni2, nombre2, apellido2, edad2);

        persona1.imprimirDatos();
        persona1.esMayorDeEdad();
        persona2.imprimirDatos();
        persona2.esMayorDeEdad();
    }

}
