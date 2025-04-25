package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("test1.txt")) {
            int ch = fis.read();
            System.out.printf("ch:%d, %c%n", ch, (char)ch);

            ch = fis.read();
            System.out.printf("ch:%d, %c%n", ch, (char)ch);

            ch = fis.read();
            System.out.printf("ch:%d, %c%n", ch, (char)ch);

            ch = fis.read();
            System.out.printf("ch:%d, %c%n", ch, (char)ch);

            ch = fis.read(); // -1 : 파일을 다 읽었다.
            System.out.printf("ch:%d, %c%n", ch, (char)ch);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
