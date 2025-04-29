package exam02;

import java.util.Vector;

public class Ex03 {
    public static void main(String[] args) {
        Vector<String> items = new Vector<>(3);
        items.add("이름1");
        items.add("이름2");
        items.add("이름3");
        System.out.printf("items.capacity():%d%n", items.capacity());

        items.add("이름4");
        items.add("이름5");
        items.add("이름6");
        System.out.printf("items.capacity():%d%n", items.capacity());

        items.add("이름7");
        System.out.printf("items.capacity():%d%n", items.capacity());
    }
}
