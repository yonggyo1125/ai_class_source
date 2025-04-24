package exam02;

public class Outer2 {
    private int num1 = 100;

    private static int num2 = 200;

    public void instanceMethod() {}
    public static void staticMethod() {
        System.out.println("정적 메서드!");
    }
    /**
     * 정적 내부 클래스
     */
    static class Inner {

        public void method() {
            System.out.println("정적 내부 클래스!");
           // System.out.println(num1); 외부 클래스의 인스턴스 자원 접근 불가
            // instanceMethod();

            // 정적 자원은 접근 가능
            System.out.println(num2);
            staticMethod();
        }
    }
}
