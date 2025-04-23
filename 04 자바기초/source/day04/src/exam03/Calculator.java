package exam03;

public abstract class Calculator {

    int num = 100;

    public Calculator() {
        System.out.println("Calculator() 생성자!");
    }

    public abstract  int add(int num1, int num2);
}
