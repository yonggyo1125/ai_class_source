package exam03;

public class Ex02 {
    public static void main(String[] args) {
        //Integer num1 = new Integer(10);
        //Integer num2 = new Integer(10);
        Integer num1 = Integer.valueOf(10000);
        Integer num2 = Integer.valueOf(10000);

        System.out.println(num1 == num2);
        /**
         * 재료가 되는 값 10을 가지고 모든 메서드의 결과는 num1, num2이든
         * 다 똑같다!
         */
        long num3 = num1.longValue();
        long num4 = num2.longValue();
    }
}
