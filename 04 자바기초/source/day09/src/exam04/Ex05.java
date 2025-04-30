package exam04;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Ex05 {
    public static void main(String[] args) {
        // 문자열 -> 문자열 길이
        Function<String, Integer> func1 = s -> s.length();

        // 정수 -> 정수 제곱
        UnaryOperator<Integer> func2 = x -> x * x;

        // 문자열 -> 길이 -> 정수 제곱
        Function<String, Integer> func3 = func1.andThen(func2);

        int value = func3.apply("안녕하세요");
        System.out.println(value);
    }
}
