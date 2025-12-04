package P4;
public class P4E2 {

    public static void main(String[] args) {
        int inicial = 2000;
        double anuales = 0.0275;
        double corto = 0.18;
        double interes = (inicial * anuales) / 2;
        
        System.out.println("Cantidad inicial: " + inicial);
        System.out.println("Cantidad final: " + (inicial + (interes - (interes * corto))));
    }
}
