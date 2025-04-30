package exam06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        String[] fruits = { "사과", "사과", "사과", "오렌지", "멜론", "망고"};
        String[] fruits2 = Arrays.stream(fruits).sorted(Comparator.reverseOrder())
                .distinct().map(s -> "♥"+ s +"♥").toArray(String[]::new);
        System.out.println(Arrays.toString(fruits2));

        List<String> fruits3 = List.of("사과", "사과", "사과", "오렌지", "멜론", "망고");
        String[] fruits4 = fruits3.stream().sorted(Comparator.reverseOrder())
                .distinct().map(s -> "♥"+ s +"♥").toArray(String[]::new);

        System.out.println(Arrays.toString(fruits4));

    }
}
