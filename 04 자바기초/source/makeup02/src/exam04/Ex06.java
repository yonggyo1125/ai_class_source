package exam04;

import java.io.*;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) throws IOException {
        System.out.print("입력:");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        System.out.println(line);
        /*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //char ch = (char)in.read();
       //System.out.println(ch);
        String line = in.readLine(); // 문자열 단위로 입력
        System.out.println(line); */
    }
}
