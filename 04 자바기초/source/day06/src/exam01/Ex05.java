package exam01;

public class Ex05 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            int result = num1 / num2; // ArithmethicException ... 발생
            System.out.println(result);

            String str = null;
            str = str.toUpperCase(); // 소문자 -> 대문자, NullPointerException 발생
            System.out.println(str);
            // NullPointerException e = new NullPointerException()...
        } catch (RuntimeException e) {
            String message = e.getMessage();
            System.out.println(message);

            if (e instanceof NullPointerException) {
                System.out.println("NullPointerException에 대한 처리...");
            }

        }
    }
}
