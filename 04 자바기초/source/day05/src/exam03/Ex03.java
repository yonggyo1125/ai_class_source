package exam03;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        String[] fruits = {"사과", "오렌지", "멜론", "망고"};
        /*
        MyFunc func = new MyFunc() {
            @Override
            public String[] apply(String[] items, String ch) {
                for (int i = 0; i < items.length; i++) {
                    items[i] = ch + items[i] + ch;
                }

                return items;
            }
        };
        */
        method(new MyFunc() {
            @Override
            public String[] apply(String[] items, String ch) {
                for (int i = 0; i < items.length; i++) {
                    items[i] = ch + items[i] + ch;
                }

                return items;
            }
        }, fruits);
    }

    public static void method(MyFunc func, String[] items) {
        String[] result = func.apply(items, "*");

        System.out.println(Arrays.toString(result));
    }
}
