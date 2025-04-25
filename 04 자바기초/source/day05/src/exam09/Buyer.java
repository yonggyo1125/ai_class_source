package exam09;

public interface Buyer {
    int NUM = 100; // public static final // 정적 상수
    void buy();
    default void order() {
        System.out.println("Buyer - 주문하기");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("privateMethod()");
    }

    static void staticMethod() { // public
        System.out.println("정적 메서드!");
    }
}
