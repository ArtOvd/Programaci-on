package PR6_6_2;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
//        ArrayList<Figura> figuras = new ArrayList<>();
//        figuras.add(new Rectangulo(5,8,2.5,3.0));
//        figuras.add(new Triangulo(3,3,3.0,4.0));
//        figuras.add(new Cubo(10,10,10.0));
//        for (Figura figura : figuras) {
//            System.out.println(figura.toString());
//            System.out.println("=======");
//        }

        ArrayList<IFigura2D> figuras2D = new ArrayList<>();
        figuras2D.add(new Rectangulo(5,8,2.5,3.0));
        figuras2D.add(new Triangulo(3,3,3.0,4.0));
        for (IFigura2D figura2D : figuras2D) {
            System.out.println(figura2D.calcularArea());
        }

        ArrayList<IFigura3D> figuras3D = new ArrayList<>();
        figuras3D.add(new Cubo(10,10,10.0));
        for (IFigura3D figura3D : figuras3D) {
            System.out.println(figura3D.calcularVolumen());
        }
    }
}
