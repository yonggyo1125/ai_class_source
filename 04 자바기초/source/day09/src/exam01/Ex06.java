package exam01;

import java.util.Arrays;

public class Ex06 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        //System.out.println(nums);
        System.out.println(Arrays.toString(nums));

        int[][] nums2 = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.deepToString(nums2));
    }
}
