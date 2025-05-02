package exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toCollection;

public class Ex05 {
    public static void main(String[] args) {
        List<Book> items = List.of(
                new Book(1000, "책1", "저자1"),
                new Book(1001, "책2", "저자2"),
                new Book(1002, "책3", "저자2"),
                new Book(1003, "책4", "저자3"),
                new Book(1004, "책5", "저자3`")
        );

        Map<String, List<Book>> items2 = items.stream()
                .collect(Collectors.groupingBy(Book::getAuthor));

        List<Book> items3 = items2.get("저자2"); // 저자2번의 도서
        items3.forEach(System.out::println);

        // 책의 이름만 모아서 ArrayList 객체로 변환
        ArrayList<String> items4 = items.stream()
                .map(Book::getTitle)
                .collect(toCollection(ArrayList::new));
        items4.forEach(System.out::println);

        // 책의 이름만 모아서 책1,책2,책3, ... 문자열로 변환
        String books = items.stream().map(Book::getTitle)
                .collect(joining(","));
        System.out.println(books);
    }
}
