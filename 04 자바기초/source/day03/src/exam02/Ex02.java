package exam02;

public class Ex02 {
    public static void main(String[] args) {
        //Schedule2 s1 = new Schedule2(2025, 4, 22);
        Schedule2 s1 = new Schedule2();

        s1.showDate();

        Schedule2 s2 = s1.getThis();
        System.out.println(s1 == s2);
    }
}
