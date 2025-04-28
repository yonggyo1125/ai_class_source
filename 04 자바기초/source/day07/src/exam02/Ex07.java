package exam02;

import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {
        int result1 = sum(10, 20, 30, 40);
        int result2 = sum(10, 20);

        System.out.println(result1);
        System.out.println(result2);
    }

    static int sum(int... nums) {
        //System.out.println(Arrays.toString(nums));
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        return total;
    }
}
