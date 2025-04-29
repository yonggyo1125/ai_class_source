package exam04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;

public class Ex04 {
    public static void main(String[] args) throws ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream("items.obj");
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            Map<String, Object> items = (Map<String, Object>)ois.readObject();

            String message = (String)items.get("message");
            Book book2 = (Book)items.get("book2");

            System.out.println(message);
            System.out.println(book2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
