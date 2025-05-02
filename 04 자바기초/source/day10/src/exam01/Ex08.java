package exam01;

import java.util.List;

public class Ex08 {
    public static void main(String[] args) {
        List<String> items = List.of("사과", "오렌지", "멜론", "망고");
        List<String> items2 = items.stream().skip(2).toList();
        System.out.println(items2);
    }
}
