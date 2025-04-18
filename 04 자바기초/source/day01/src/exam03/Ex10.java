package exam03;

public class Ex10 {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 10.123;

        /**
         * 연산은 같은 자료형 끼리만 가능!
         * 연산을 하기 위해서 다른 자료형을 변경해서 같은 자료형으로 맞춰준다!
         * (자동)
         * 1) int -> dounle
         * 2) double -> int
         *
         * 자료형을 결정 하는 기준, 자동 형변환이 기준
         * (작은 자료형 -> 큰자료형)
         * (정수 -> 실수)
         *
         * 1)으로 선택됨
         * int num1 -> double num1
         */
        double result = num1 + num2;
        //System.out.println(num1 + num2);
    }
}
