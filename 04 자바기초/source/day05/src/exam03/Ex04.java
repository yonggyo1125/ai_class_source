package exam03;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class Ex04 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        IntUnaryOperator oper = new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand * operand;
            }
        };
        int[] nums2 = Arrays.stream(nums).map(oper).toArray();
        System.out.println(Arrays.toString(nums2));


        int[] nums3 = Arrays.stream(nums).map(new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand * operand;
            }
        }).toArray();

        int[] nums4 = Arrays.stream(nums).map(x -> x * x).toArray();
        System.out.println(Arrays.toString(nums4));
    }
}
