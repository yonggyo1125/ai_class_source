package exam01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Ex04 {
    public static void main(String[] args) {
        int[] scores = { 90, 88, 100, 60, 55, 78};
        //IntStream stm = Arrays.stream(scores);
        // IntStream
        int[] scores2 = Arrays.stream(scores).sorted().toArray();
        System.out.println(Arrays.toString(scores2));

        // boxed() : IntStream -> Stream<Integer>
        int[] scores3 = Arrays.stream(scores)
                                .boxed()
                                .sorted(Comparator.reverseOrder())
                                .mapToInt(s -> s) // Stream<Integer> -> IntStream
                                .toArray();
        System.out.println(Arrays.toString(scores3));
    }
}
