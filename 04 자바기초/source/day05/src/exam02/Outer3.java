package exam02;

public class Outer3 {

    public void method() {
        class Inner {

            public int add (int num1, int num2) {
                return num1 + num2;
            }
        }

        Inner in = new Inner();
        int result = in.add(10, 20);
        System.out.println(result);
    }
}
