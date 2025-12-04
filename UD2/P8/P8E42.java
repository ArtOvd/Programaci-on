import java.util.Scanner;

public class P8E42 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String pal = leer.next().toLowerCase();
        int voc1 = 0, voc2 = 0, voc3 = 0, voc4 = 0, voc5 = 0;

        for (int i = 0; i < pal.length(); i++) {
            switch (pal.charAt(i)) {
                case 'a':
                    voc1++;
                    break;
                case 'e':
                    voc2++;
                    break;
                case 'i':
                    voc3++;
                    break;
                case 'o':
                    voc4++;
                    break;
                case 'u':
                    voc5++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("A: " + voc1);
        System.out.println("E: " + voc2);
        System.out.println("I: " + voc3);
        System.out.println("O: " + voc4);
        System.out.println("U: " + voc5);
    }

}
