public class P8E37 {
    
    public static void main(String[] args) {
        
        for (int m = 1; m <= 12; m++) {
            switch (m) {
                case 2:
                    for (int d = 1; d <= 28; d++) {
                    System.out.println(d + "/" + m);
                    }
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    for (int d = 1; d <= 31; d++) {
                    System.out.println(d + "/" + m);
                    }
                    break;
                default:
                    for (int d = 1; d <= 30; d++) {
                    System.out.println(d + "/" + m);
                    }
                    break;
            }
            System.out.println();
        }

    }

}
