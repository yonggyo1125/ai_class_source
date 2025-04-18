package exam03;

public class Ex06 {
    public static void main(String[] args) {
        /**
         * 정수를 int로 인식 10000000000 -> int 범위를 넘어가는 숫자 -> 오류!
         */
        //long num1 = 10000000000; // 정수면 무조건 int부터 자료형을 결정 -> int가 아니면 long으로 변환
        long num1 = 10000000000L; // 처음부터 long 자료형으로 인식 8바이트의 공간 할당!
        long num3 = 10_000_000_000L; // 가독성을 높이기 위해서 _를 사용할 수 있다!

        //double num2 = 10.1234;
       // float num2 = 10.1234; // 실수면 무조건 double로 자료형을 결정 -> double이 아니면 변경(float)

        float num2 = 10.1234F;

        byte num4 = 100; // int로 자료형 결정 -> byte 변환
    }
}
