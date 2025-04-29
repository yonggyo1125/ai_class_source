package exam02;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex06 {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("이름1");
        items.add("이름2");
        items.add("이름3");
        items.add("이름4");
        items.add("이름5");

        Iterator<String> itr = items.iterator();
        while(itr.hasNext()) { // 다음 요소가 있는지 체크
            String item = itr.next();
            System.out.println(item);
        }

        itr = items.iterator();
        while(itr.hasNext()) { //
            String item = itr.next();
            System.out.println(item);
        }
    }
}
