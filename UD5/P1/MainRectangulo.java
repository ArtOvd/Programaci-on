package P1;

public class MainRectangulo {

    static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo rectangulo2 = new Rectangulo(7, 9, 2, 3);

        rectangulo1.mostrarRecangulo();
        System.out.println("Perimetro: " +  rectangulo1.calcularPerimetro());
        System.out.println("Area: " +  rectangulo1.calcularArea());

        rectangulo2.mostrarRecangulo();
        System.out.println("Perimetro: " + rectangulo2.calcularPerimetro());
        System.out.println("Area: " + rectangulo2.calcularArea());
        System.out.println("MODIFICACION DEL RECATNGULO 1:");
        rectangulo1.setX1(rectangulo1.getX1() + 5);
        rectangulo1.setY1(rectangulo1.getY1() + 8);
        rectangulo1.setX2(rectangulo1.getX2() + 10);
        rectangulo1.setY2(rectangulo1.getY2() + 12);
        System.out.println("Perimetro: " +  rectangulo1.calcularPerimetro());
        System.out.println("Area: " +  rectangulo1.calcularArea());
    }
}
