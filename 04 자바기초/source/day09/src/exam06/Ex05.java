package exam06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Ex05 {
    public static void main(String[] args) {
        List<String> items = map(List.of("사과", "오렌지", "멜론"), s -> "★" + s);
        System.out.println(items);
    }

    static List<String> map(List<String> items, UnaryOperator<String> func) {
        List<String> newItems = new ArrayList<>();

        for (String item: items) {
            String converted = func.apply(item);
            newItems.add(converted);
        }

        return newItems;
    }
}
