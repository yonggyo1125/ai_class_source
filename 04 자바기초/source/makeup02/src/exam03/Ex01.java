package exam03;

import java.io.File;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) throws IOException  {
        File file = new File("C:/test");
        // 디렉토리 생성하기
        if (!file.exists() || !file.isDirectory()) {
            file.mkdir();
        }

        File file2 = new File("C:/test/sub1/sub2");
        if (!file2.exists() || !file2.isDirectory()) {
            file2.mkdirs(); // 하위 디렉토리까지 재귀적으로 생성
        }

        //File file3 = new File("C:/test/text1.txt");
        File file3 = new File(file, "test1.txt");
        file3.createNewFile(); // 빈 새로운 파일 생성
    }
}
