package exam02;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ex07 {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("이름1");
        items.add("이름2");
        items.add("이름3");
        items.add("이름4");
        items.add("이름5");

        ListIterator<String> iter = items.listIterator();
        System.out.println("---- 순방향 조회 ------");
        while(iter.hasNext()) {
            String item = iter.next();
            int index = iter.nextIndex();
            System.out.printf("item:%s, index:%d%n", item, index);
        }

        System.out.println("---- 역방향 조회 ------");
        while(iter.hasPrevious()) {
            String item = iter.previous();
            int index = iter.previousIndex();
            System.out.printf("item:%s, index:%d%n", item, index);
        }
    }
}
