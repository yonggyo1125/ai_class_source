package exam01;

public class Ex02 {
    public static void main(String[] args) {
        String s1 = new String("ABC");
        String s2 = new String("ABC");

        System.out.printf("s1 == s2:%s, s1.equals(s2):%s%n", s1 == s2, s1.equals(s2));
        System.out.printf("s1 주소:%d%n", System.identityHashCode(s1));
        System.out.printf("s2 주소:%d%n", System.identityHashCode(s2));
    }
}
