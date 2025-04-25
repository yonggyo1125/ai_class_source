package exam02;

public class Ex02 {
    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println(result);
    }

    public static int add(int num1, int num2) {
        try {
            return num1 + num2;
        } finally {
            System.out.println("실행");
        }
    }
}
