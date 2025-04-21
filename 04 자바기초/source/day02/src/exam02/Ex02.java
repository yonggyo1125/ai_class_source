package exam02;

public class Ex02 {
    public static void main(String[] args) {
        /**
         * nums[0], nums[1], nums[2], nums[3] -> 총 변수 4개
         * nums : 참조변수, 배열에서 첫번째 변수의 주소 값
         */
        int[] nums = new int[4]; // int 자료형 변수 4개
        System.out.println(nums); // 첫번째 변수의 주소값

        nums[0] = 10;
        System.out.println(nums[0]);
    }
}
