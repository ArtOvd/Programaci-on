package P1;

public class P1E3 {
    
    public static void main(String[] args) {
        
        int array[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            suma += array[i];
        }
        System.out.println();
        System.out.println("Suma: " + suma);
    }

}
