package exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
           fis = new FileInputStream("b.txt");

        } catch (IOException e) {

            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {}
            }

            System.out.println("예외가 있던 없던 무조건 자원해제!");
        }
    }
}
