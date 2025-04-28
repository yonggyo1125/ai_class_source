package exam01;

import java.io.*;

public class Ex06 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try (FileInputStream fis = new FileInputStream("lecture.zip");
             BufferedInputStream bis = new BufferedInputStream(fis); // 8kb 버퍼(기본)
             FileOutputStream fos = new FileOutputStream("lecture_copied2.zip");
             BufferedOutputStream bos = new BufferedOutputStream(fos)) { // 8kb 버퍼(기본)

            while(bis.available() > 0) {
                bos.write(bis.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.printf("걸린시간 : %d%n", end - start);
    }
}
