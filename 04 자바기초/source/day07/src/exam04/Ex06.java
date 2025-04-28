package exam04;

import java.util.Arrays;

public class Ex06 {
    public static void main(String[] args) {
        // 정의된 모든 상수 객체 목록 배열로 반환
        Transportation[] items = Transportation.values();
        System.out.println(Arrays.toString(items));
    }
}
