package exam01;

import java.util.Comparator;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> items = List.of("Apple", "Orange", "Orange", "Melon", "Mango");
        items.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
        /**
         * .sorted(Comparator.reverseOrder())
         * .distinct() : 중간 연산 / 최종 연산이 호출되기 전까지 대기, 최종 연산이 호출되면 스트림을 소비하면서 연산이 진행, 지연된 연산
         *
         * .forEach() : 최종 연산 / 실제 연산이 진행되고 결과가 나온다.
         */
    }
}
