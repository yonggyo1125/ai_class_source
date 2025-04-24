package exam04;

public class Ex03 {
    public static void main(String[] args) {
        A ac = new C();
        A ad = new D();

        if (ad instanceof C) {
            C c1 = (C) ad;
        }

        if (ac instanceof C) {
            C c2 = (C)ac;
            System.out.println(c2);
        }

        if (ac instanceof C c2) { //  JDK 17

        }
    }
}
