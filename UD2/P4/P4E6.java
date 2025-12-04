package P4;
public class P4E6 {
    
    public static void main(String[] args) {
        
        int lado1 = 15;
        int lado2 = 25;
        int p = 2 * (lado1 + lado2);
        double s = (lado1 * lado2) * 0.0001;

        System.out.println("Lado1: " + lado1);
        System.out.println("Lado2: " + lado2);
        System.out.println("Preímetro: " + p);
        System.out.println("Superficie: " + s + " m²");
    }
}
