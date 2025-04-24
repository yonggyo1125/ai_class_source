package exam03;

public class Outer4 {


    Calculator method(int num3) {
        Calculator cal = new Calculator() {

            @Override
            public int add(int num1, int num2) {
                //num3 = 1000;
                /**
                 * num3이 제거되면 안되므로 계속 유지가 되어야 한다.
                 * 지역변수가 상수화 되면서 코드 영역 메모리(정적 메모리)에 할당
                 * 컴파일러가 final 예약어를 자동 추가
                 */
                return num1 + num2 + num3;
            }
        };

        return cal;
    }
}
