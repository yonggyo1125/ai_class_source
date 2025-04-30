package exam05;

import java.util.Arrays;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<String> items = List.of("이름1", "이름2", "이름3");

       //String[] items2 = items.stream().toArray(i -> new String[i]);
        String[] items2 = items.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(items2));
    }
}
