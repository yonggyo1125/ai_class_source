package exam04;

import java.util.function.IntPredicate;

public class Ex06 {
    public static void main(String[] args) {
        IntPredicate cond1 = x -> x >= 130;
        IntPredicate cond2 = x -> x <= 195;
        IntPredicate cond3 = cond1.and(cond2); // x >= 130 && x <= 195
        IntPredicate cond4 = cond3.negate(); // x < 130 || x > 195

        boolean result1 = cond3.test(120); // false
        boolean result2 = cond3.test(200); // false
        boolean result3 = cond3.test(175); // true
        System.out.printf("result1=%s, result2=%s, result3=%s%n", result1, result2, result3);

        System.out.println(cond4.test(120)); // true
    }
}
