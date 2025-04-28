package exam02;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("test5.txt");
            DataInputStream dis = new DataInputStream(fis)) {

            boolean result = dis.readBoolean();
            int num = dis.readInt();
            //byte num = dis.readByte();

            String str = dis.readUTF();

            System.out.printf("num=%d, result=%s, str=%s%n", num, result, str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
