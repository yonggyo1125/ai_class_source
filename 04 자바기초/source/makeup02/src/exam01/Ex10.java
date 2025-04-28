package exam01;

import java.io.FileReader;
import java.io.IOException;

public class Ex10 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("test4.txt")) {
            int ch;
            while((ch = fr.read()) != -1) {
                System.out.print((char)ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
