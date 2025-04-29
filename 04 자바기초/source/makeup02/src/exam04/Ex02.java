package exam04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex02 {
    public static void main(String[] args) throws ClassNotFoundException{
        try (FileInputStream fis = new FileInputStream("book.obj");
            ObjectInputStream ois = new ObjectInputStream(fis)) {

            Book book = (Book)ois.readObject();
            System.out.println(book);

            Book book2 = (Book)ois.readObject();
            System.out.println(book2);

            String message = (String)ois.readObject();
            System.out.println(message);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
