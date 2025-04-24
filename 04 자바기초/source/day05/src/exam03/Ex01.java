package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Outer4 out = new Outer4();
        Calculator cal = out.method(30);
        int result = cal.add(10, 20);
        System.out.println(result);
    }
}
