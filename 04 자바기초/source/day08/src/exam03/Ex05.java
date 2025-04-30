package exam03;

import java.util.Comparator;
import java.util.TreeSet;

public class Ex05 {
    public static void main(String[] args) {
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        TreeSet<String> items = new TreeSet<>(comp);
        items.add("이름3");
        items.add("이름3");
        items.add("이름3");
        items.add("이름4");
        items.add("이름1");
        items.add("이름2");
        items.add("이름5");

        System.out.println(items);
    }
}