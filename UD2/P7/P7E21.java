package P7;
import java.util.Scanner;

public class P7E21 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Indica el peso del paciente en kg: ");
        double peso = leer.nextDouble();

        System.out.print("Indica la altura del paciente en metros: ");
        double altura = leer.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 16 ) {
            System.out.println("Criterio de ingreso en hospital");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Infrapeso");
        } else if (imc >= 17 && imc < 18) {
            System.out.println("Bajo peso");
        } else if (imc >= 18 && imc < 25) {
            System.out.println("Peso normal (Saludable)");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso (Obesidad de grado I)");  
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Sobrepeso crónico (Obesidad de grado II)");           
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidad premórbida (Obesidad de grado III)");
        } else if (imc > 40) {
            System.out.println("Obesidad mórbida (Obesidad de grado IV)");
        }

    }

}
