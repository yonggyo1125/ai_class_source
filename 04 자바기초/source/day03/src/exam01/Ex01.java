package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(); // 생성자 함수
        s1.id = 1000;
        s1.name = "이이름";
        s1.major = "컴퓨터과학";

        s1.study();
        System.out.printf("s1주소: %d%n", System.identityHashCode(s1));

        Student s2 = new Student();
        s2.id = 1001;
        s2.name = "김이름";
        s2.major = "컴퓨터과학";

        s2.study();
        System.out.printf("s2주소: %d%n", System.identityHashCode(s2));

        System.out.printf("s1==s2:%s%n", s1 == s2);

        Student s3 = s2;  // s2가 가지고 있는 주소값을 s3에 대입
        s3.id = 1002;
        s3.name = "박이름";
        s3.major = "컴퓨터과학";

        s3.study();
        s2.study();

        System.out.printf("s2 == s3:%s%n", s2 == s3); // true, s2와 s3은 같은 주소값

        s1 = null; // null은 값이 없는 상태
    }
}
