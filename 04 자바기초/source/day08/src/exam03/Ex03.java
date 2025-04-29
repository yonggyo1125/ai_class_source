package exam03;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex03 {
    public static void main(String[] args) {
        TreeSet<String> items = new TreeSet<>();
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
