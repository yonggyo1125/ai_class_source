package exam02;

public class Ex04 {
    public static void main(String[] args) {
        String str1 = "ABC";
        System.out.printf("str1 주소:%d%n", System.identityHashCode(str1));

        str1 += "DEF";
        System.out.printf("str1 주소:%d%n", System.identityHashCode(str1));

        str1 += "GHI";
        System.out.printf("str1 주소:%d%n", System.identityHashCode(str1));

        System.out.println(str1);
    }
}
