package exam04;

import java.util.function.ToIntFunction;

public class Ex07 {
    public static void main(String[] args) {
        // 숫자 문자열 -> int 정수 변환
        //ToIntFunction<String> func = s -> Integer.parseInt(s);
        ToIntFunction<String> func = Integer::parseInt; // 메서드 참조

        int value = func.applyAsInt("1234");
        System.out.println(value);
    }
}
