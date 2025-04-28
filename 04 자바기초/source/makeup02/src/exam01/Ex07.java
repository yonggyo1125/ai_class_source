package exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex07 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("test3.txt");
             OutputStreamWriter osw = new OutputStreamWriter(fos)) {
            osw.write("안녕하세요.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
