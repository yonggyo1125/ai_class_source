package exam01;

public class Q1 {
    // 1. 변수 두 개를 선언해서 20과 3.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해 보시오
    public static void main(String[] args) {
        int num1 = 20;
        double num2 = 3.6;

        int result1 = num1 * (int)num2; // 오답 - 오차가 큼
        int result2 = (int)(num1 * num2);// 정답

        System.out.printf("result1=%d, result2=%d%n", result1, result2);
    }
}
