package exam02;

import java.util.LinkedList;
import java.util.Queue;

public class Ex05 {
    public static void main(String[] args) {
        Queue<String> items = new LinkedList<>();
        items.offer("이름1");
        items.offer("이름2");
        items.offer("이름3");

        while(items.size() > 0) {
            String item = items.poll();
            System.out.println(item);
        }
    }
}
