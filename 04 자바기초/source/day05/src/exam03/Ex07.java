package exam03;

public class Ex07 {
    public static void main(String[] args) {
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 - num2;
            }
        };

        process(cal, 10, 20);


        process(new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 - num2;
            }
        }, 10, 20);


        process((x,y) -> x + y, 10, 20);
    }

    public static void process(Calculator cal, int num1, int num2) {
        int result = cal.add(num1, num2);

        System.out.println(result);
    }
}
