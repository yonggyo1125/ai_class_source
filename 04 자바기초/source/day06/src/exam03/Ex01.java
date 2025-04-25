package exam03;

public class Ex01 {
    public static void main(String[] args) {
        try (MyResource myResource = new MyResource()) {

            /**
             * 내부적으로 어떤 객체인지는 알수 없지만
             * 알수 있는 단 한가지, AutoCloseable 인터페이스의 구현 클래스임은 알수 있음
             * if (myResource instanceof AutoCloseable) {
             *      AutoCloseable my = myResource;
             *      my.close()...
             * }
             */
        } catch (Exception e) {}
    }
}
