package P4;
public class P4E5 {
    
    public static void main(String[] args) {
        
        int a = 2;
        int b = 4;
        int eq1 = -a + 5 % b - a * a;
        int eq2 = 5 + 3 % 7 * b * a - b % a;
        int eq3 = (a + 1) * (b + 1) - b / a;

        System.out.println("a) -a + 5 % b - a * a = "+ eq1);
        System.out.println("b) 5 + 3 % 7 * b * a - b % a = " + eq2);
        System.out.println("c) (a + 1) * (b + 1) - b / a = " + eq3);
    }
}
