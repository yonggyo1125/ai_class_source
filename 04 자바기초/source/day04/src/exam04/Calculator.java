package exam04;

public interface Calculator {
    int num = 10; // public static final - 정적 상주
    //public abstract int add(int num1, int num2);
    // public abstract - 컴파일러가 자동 추가
    int add(int num1, int num2);
}
