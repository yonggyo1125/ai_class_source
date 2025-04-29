package exam03;

import java.io.File;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) throws Exception  {
        File tempDir = new File("C:/tmp");
        if (!tempDir.exists() || !tempDir.isDirectory()) {
            tempDir.mkdir();
        }

        File tempFile = File.createTempFile("tmp_", ".log", tempDir);
        //tempFile.delete(); // 바로 삭제

        Thread.sleep(1000 * 5);

        tempFile.deleteOnExit(); // 애플리케이션 종료시 삭제
    }
}
