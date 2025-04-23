package exam01;

public class Ex03 {

    public static void main(String[] args) {
        A ac = new C();
        A ad = new D();

        if(ad instanceof C) { // ad가 가리키는 객체가 C에서 유래되었는지 체크
            C c1 = (C) ad; // 상위클래스 자료형 -> 하위클래스 자료형으로 변경 강제 형변환!
        }

        if (ac instanceof C c2) { // JDK 17버전에서 추가된 문법
            System.out.println(c2.numC);
        }
    }
}
