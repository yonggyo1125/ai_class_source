package exam04;

import java.io.IOException;
import java.io.PrintStream;

public class Ex05 {
    public static void main(String[] args) throws IOException {
        //System.err.println("에러 발생!");
        PrintStream ps = new PrintStream("error.log");
        System.setErr(ps);
        System.out.println(10 / 0);
    }
}
