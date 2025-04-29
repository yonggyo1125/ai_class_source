package exam04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex01 {
    public static void main(String[] args) {
        Book book = new Book(1000, "책1", "저자1", "출판사1");
        Book book2 = new Book(1001, "책2", "저자2", "출판사2");
        try (FileOutputStream fos = new FileOutputStream("book.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(book);
            oos.writeObject(book2);
            oos.writeObject("안녕하세요.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
