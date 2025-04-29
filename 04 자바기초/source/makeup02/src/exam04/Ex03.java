package exam04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Ex03 {
    public static void main(String[] args) {
        Map<String, Object> items = new HashMap<>();

        try (FileOutputStream fos = new FileOutputStream("items.obj");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            items.put("book1", new Book(1000, "책1", "저자1", "출판사1"));
            items.put("book2", new Book(1001, "책2", "저자2", "출판사2"));
            items.put("message", "안녕하세요.");

            oos.writeObject(items);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
