package P1;

public class MainPunto {

    static void main(String[] args) {
        Punto punto1 = new Punto(5, 0);
        Punto punto2 = new Punto(10, 10);
        Punto punto3 = new Punto(-3, 7);

        punto1.mostrarDatos();
//        punto2.mostrarDatos();
//        punto3.mostrarDatos();
        System.out.println("MODIFICADO");
        punto1.setXY(15,14);
        punto1.desplazar(5, 1);
        punto1.mostrarDatos();
        Punto punto = new Punto(5, 0);
        System.out.println(punto1.calcularDistancia(punto));

    }

}
