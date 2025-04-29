package exam03;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex04 {
    public static void main(String[] args) {
        TreeSet<Book> items = new TreeSet<>();

        items.add(new Book(1003, "책4", "저자4", "출판사4"));
        items.add(new Book(1002, "책3", "저자3", "출판사3"));
        items.add(new Book(1000, "책1", "저자1", "출판사1"));
        items.add(new Book(1001, "책2", "저자2", "출판사2"));
        items.add(new Book(1001, "책2", "저자2", "출판사2"));
        items.add(new Book(1004, "책5", "저자5", "출판사5"));

        for (Book item : items) {
            System.out.println(item);
        }
    }
}
