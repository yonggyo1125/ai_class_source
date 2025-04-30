package exam01;

public class Ex04 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {1,2,3,4,5};

        boolean isSame = true;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i]) {
                isSame = false;
                break;
            }
        }

        System.out.println(isSame);
    }
}
