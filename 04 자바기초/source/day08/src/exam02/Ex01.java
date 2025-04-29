package exam02;

import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("이름1");
        items.add("이름2");
        items.add("이름3");
        items.add("이름4");
        items.add("이름5");

        for (int i = 0; i < items.size(); i++) {
            items.remove(i);
           //String name = items.get(i);
           // System.out.println(name);
        }

        System.out.println(items); // items.toString();
        /*
        for (String item : items) {
            System.out.println(item);
        } */
    }
}
