package exam01;

import java.util.stream.IntStream;

public class Ex05 {
    public static void main(String[] args) {
        // 0~9
        IntStream.range(0, 10).forEach(i -> System.out.println((i + 1) + "번 반복"));

        // 1 ~ 100
        long total = IntStream.rangeClosed(1, 100).sum();
        System.out.println(total);
    }
}
