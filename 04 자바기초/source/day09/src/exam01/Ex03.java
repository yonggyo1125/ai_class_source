package exam01;

import java.util.Arrays;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        /* 수정 불가 리스트 - 추가, 제거, 변경 불가 */
        //List<String> items = List.of("Apple", "Orange", "Melon");
        List<String> items = Arrays.asList("Apple", "Orange", "Melon");

        items.add("Mango");

        System.out.println(items);
    }
}
