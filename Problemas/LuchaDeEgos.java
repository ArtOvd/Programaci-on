import java.util.Scanner;

public class LuchaDeEgos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            int count = 0;
            num = sc.nextInt();
            int[] fuerzas = new int[num];
            String[] deseados = new String[num];
            String pareja = "";

            for (int i = 0; i< fuerzas.length; i++){
                fuerzas[i] = sc.nextInt();
            }
            for (int i = 0; i < deseados.length; i++){
                    deseados[i] = sc.next();
            }

            for (int i = 0; i < fuerzas.length; i++){
                for  (int j = i + 1; j < deseados.length - 1; j++){
                    if (deseados[i].startsWith("=")){
                        if (deseados[i].charAt(1) == fuerzas[j]){
                            pareja = fuerzas[i] + " " + fuerzas[j];
                            count++;
                        }
                    } else if (deseados[i].startsWith(">")){
                        if (deseados[i].charAt(1) < fuerzas[j]){
                            pareja = fuerzas[i] + " " + fuerzas[j];
                            count++;
                        }
                    } else if (deseados[i].startsWith("<")){
                        if (deseados[i].charAt(1) > fuerzas[j]){
                            pareja = fuerzas[i] + " " +  fuerzas[j];
                        }
                    }
                    if (count > 0) {
                        System.out.println(pareja);
                    } else {
                        System.out.println("NO HAY");
                    }
                    System.out.println("---");
                }
            }

        } while (num > 0 && num <= 100);

    }

}
