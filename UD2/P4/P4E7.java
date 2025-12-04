package P4;
public class P4E7 {
    
    public static void main(String[] args) {
        
        double diametro = 15.5;
        double radio = diametro / 2;
        double altura = 42.4;
        double areaBase = 3.14 * (radio * radio);
        double areaLateral = 2 * 3.14 * radio * altura;
        double areaTotal = 2 * (areaBase) + (areaLateral);
        double volumen = 3.14 * (radio * radio) * altura;

        System.out.println("Alto: " + altura);
        System.out.println("Diametro: " + diametro);
        System.out.println("Area: " + areaTotal);
        System.out.println("Volumen: " + volumen);
    }
}
