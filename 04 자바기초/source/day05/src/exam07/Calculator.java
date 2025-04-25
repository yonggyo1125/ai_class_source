package exam07;

public interface Calculator {
    int add(int num1, int num2); // public abstract

    default int minus(int num1, int num2) {
        return num1 - num2;
    }
}
