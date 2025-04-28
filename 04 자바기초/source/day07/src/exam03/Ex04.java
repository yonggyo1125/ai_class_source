package exam03;

public class Ex04 {
    public static void main(String[] args) {
        /**
         * 같은 자료형면 변수의 값으로 할당 가능!
         * 선언은 참조 자료형인 Integer 클래스
         * 값은 기본 자료형인 int
         */
        Integer num1 = 100; // Integer.valueOf(100); : 오토 박싱
        Integer num2 = 200; // 오토박싱

        // num1.intValue() + num2.intValue() : 언박싱
        // Integer result = 300 -> 오토박싱
        Integer result = num1 + num2;
        System.out.println(result);
    }
}
