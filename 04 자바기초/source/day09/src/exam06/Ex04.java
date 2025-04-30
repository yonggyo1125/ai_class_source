package exam06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Ex04 {
    public static void main(String[] args) {
        List<String> fruits3 = List.of("사과", "사과", "사과", "오렌지", "멜론", "망고");
        Stream<String> stm = fruits3.stream();
        String[] fruits4 = stm.sorted(Comparator.reverseOrder())
                .distinct().map(s -> "♥"+ s +"♥").toArray(String[]::new);

        System.out.println(Arrays.toString(fruits4));
        System.out.printf("원본: %s%n", fruits3);

        //stm = fruits3.stream();
        String[] fruits5 = stm.sorted(Comparator.reverseOrder())
                .distinct().map(s -> "★"+ s +"★").toArray(String[]::new);
    }
}
