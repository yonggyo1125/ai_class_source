package exam02;

public class Ex06 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80}; // 0, 1, 2, 3, 4, 5
        System.out.printf("nums.length:%d%n", nums.length);

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("nums[%d]:%d%n", i, nums[i]);
        }

        System.out.println("향상된 for문---");
        for (int num : nums) {
            System.out.println(num);
        }

        /*
        for (int i = 0; i <= nums.length - 1; i++) {
            System.out.printf("nums[%d]:%d%n", i, nums[i]);
        } */
    }
}
