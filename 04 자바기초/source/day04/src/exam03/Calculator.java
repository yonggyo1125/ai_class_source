package exam03;

public abstract class Calculator {

    int num = 100;

    public Calculator() {
        System.out.println("Calculator() 생성자!");
    }

    public void commonMethod() {
        System.out.println("하위클래가 공유하는 기능!");
    }

    public abstract  int add(int num1, int num2);
}
