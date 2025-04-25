package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("test1.txt")) {
            /*
            int ch;
            while((ch = fis.read()) != -1) {
                System.out.print((char)ch);
            } */
            while(fis.available() > 0) { // 읽어올 바이트가 남아 있는 경우
                int ch = fis.read();
                System.out.print((char)ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
