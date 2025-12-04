import java.util.Scanner;

public class ejMetodosBasicos {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

       // muestraSaludo("Artem");

       // System.out.println(calculaCubo(9));

       // System.out.println(multiplicaNumeros(3, 5));

       // imprimirTablaMulti(5);

       // System.out.println(definirParImpar(5));

       // imprimirMenu(5);
    }
    
    
    public static void muestraSaludo (String nombre) {
        System.out.println("Hola " + nombre);
    }

    
    public static int calculaCubo (int num) {
        return num * num * num;
    }
    

    public static int multiplicaNumeros (int a, int b) {
        return a * b;
    }
    
    
    public static void imprimirTablaMulti(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + multiplicaNumeros(num, i));
        }
    }
    
    
    public static boolean definirParImpar (int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    
    public static void imprimirMenu (int num) {
        for (int i = 1; i <= num; i++) {
            if (num != i) {
                System.out.println("Opción número " + i);
            } else {
                System.out.println("Salir");
                break;
            }
        }
    }
    



}