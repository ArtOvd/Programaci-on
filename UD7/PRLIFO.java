import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class PRLIFO {


    public static void main(String[] args) {
        // EJ 1:
//       Stack<String> st = new Stack<String>();
//       st.push("YouTube");
//       st.push("GitHub");
//       st.push("Java");
//       st.push("JavaScript");
//       st.push("HTML");
//       st.push("CSS");
//       for (int i = 0; i < 3; i++) {
//           System.out.println(st.pop());
//       }

        // EJ 2:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Frase: ");
//        String frase = sc.nextLine();
//        Stack<String> st = new Stack<>();
//        String[] palabras = frase.split(" ");
//        for (String palabra : palabras) {
//            st.push(palabra);
//        }
//        Iterator<String> it = st.iterator();
//        while (it.hasNext()) {
//            System.out.print(st.pop());
//        }

        // EJ 3:
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        Stack<Character> st = new Stack<>();
        boolean error = false;
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(' || exp.charAt(i) == '[') {
                st.push(exp.charAt(i));
            } else if (exp.charAt(i) == ')') {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                } else {
                    error = true;
                    break;
                }
            } else if (exp.charAt(i) == ']') {
                if (!st.isEmpty() && st.peek() == '[') {
                    st.pop();
                } else {
                    error = true;
                    break;
                }
            }

        }
        if (!error && st.isEmpty()) {
            System.out.println("Expresión válida");
        } else {
            System.out.println("Expresión no válida");
        }


    }


}
