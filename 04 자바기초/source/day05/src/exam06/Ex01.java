package exam06;

public class Ex01 {
    public static void main(String[] args) {
        //Calculator cal = new Calculator();
        Calculator cal = new SimpleCalculator();
        int result = cal.add(10, 20);
        System.out.println(result);
    }
}
