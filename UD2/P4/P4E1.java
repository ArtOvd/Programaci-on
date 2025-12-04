package P4;
public class P4E1 {
    
    public static void main(String[] args) {
        int precio = 85;
        double descuento = 0.15;

        System.out.println("Precio inicial: " + precio);
        System.out.println("Porcentaje Rebaja: 15%");
        System.out.println("Rebaja: " + precio * descuento);
        System.out.println("Precio final: " + (precio - (precio * descuento)));
    }
}
