package exam01;

import java.io.FileWriter;
import java.io.IOException;

public class Ex08 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("test4.txt")) {
            fw.write("안녕하세요.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
