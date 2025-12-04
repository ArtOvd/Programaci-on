package P4;
public class P4E3 {
    
    public static void main(String[] args) {
        
        int inicial = 2000;
        double anuales = 2.75/100;
        double corto = 0.18;
        double interes = ((inicial * anuales) / 2) + ((inicial * anuales) / 4); 
        
        System.out.println("Cantidad inical: " + inicial);
        System.out.println("Intereses anuales: " + (inicial * anuales));
        System.out.println("Intereses a los 9 meses: " + interes);
        System.out.println("Retención Hacienda: " + (interes * corto));
        System.out.println("Interes neto: " + (interes - (interes * corto)));
        System.out.println("Cantidad final: " + (inicial + (interes - (interes * corto))));
        
    }
}
