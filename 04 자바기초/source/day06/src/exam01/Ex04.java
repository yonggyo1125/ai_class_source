package exam01;

public class Ex04 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        try {
            int result = num1 / num2; // ArithmethicException ... 발생
            System.out.println(result);

            String str = null;
            str = str.toUpperCase(); // 소문자 -> 대문자, NullPointerException 발생
            System.out.println(str);
            // NullPointerException e = new NullPointerException()...
        } catch (ArithmeticException | NullPointerException e) {
            String message = e.getMessage();
            System.out.println(message);

        }
    }
}
