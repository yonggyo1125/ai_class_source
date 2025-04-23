package exam03;

import java.io.InputStream;

public class Ex01 {
    public static void main(String[] args) {
        //Calculator cal = new Calculator();
        SimpleCalculator cal = new SimpleCalculator();
        int result = cal.add(10, 20);
        System.out.println(result);

        System.out.println(cal.num); // 객체의 변수로 생성

        InputStream in;
    }
}
