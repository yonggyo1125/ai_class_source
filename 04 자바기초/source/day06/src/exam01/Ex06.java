package exam01;

import java.io.FileNotFoundException;

public class Ex06 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        try {
            int result = num1 / num2; // ArithmethicException ... 발생
            System.out.println(result);

            String str = null;
            str = str.toUpperCase(); // 소문자 -> 대문자, 모르는 예외 ...
            System.out.println(str);

        } catch (ArithmeticException e) {
            String message = e.getMessage();
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("모르는 예외를 처리한다...");
        }

        FileNotFoundException e;
    }
}
