package exam04;

import java.util.function.BinaryOperator;

public class Ex02 {
    public static void main(String[] args) {
        BinaryOperator<Integer> cal = (a, b) -> a + b;
        int result = cal.apply(10, 20);
        System.out.println(result);
    }
}
