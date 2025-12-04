package P1;

public class UD4P1E10 {
    
    public static void main(String[] args) {
        
        int[] nums1 = new int[10];
        for (int i = 0; i < nums1.length; i++) {
            int num = (int) (Math.random() * 50) +1;
            nums1[i] = num;
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        int[] nums2 = new int[10];
        for (int j = 0; j < nums2.length; j++) {
                nums2[j] = nums1[j];
            System.out.print(nums2[j] + " ");
        }
    }

}
