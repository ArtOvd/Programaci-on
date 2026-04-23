import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class PRLIFO {


    public static void main(String[] args) {
        // EJ1:
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

        // EJ2:
        Scanner sc = new Scanner(System.in);
        System.out.println("Frase: ");
        String frase = sc.nextLine();
        Stack<String> st = new Stack<>();
        String[] palabras = frase.split(" ");
        for (String palabra : palabras) {
            st.push(palabra);
        }
        Iterator<String> it = st.iterator();
        while (it.hasNext()) {
            System.out.print(st.pop());
        }
    }




}
