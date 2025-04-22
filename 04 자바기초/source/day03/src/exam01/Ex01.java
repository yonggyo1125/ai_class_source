package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(); // 생성자 함수
        s1.id = 1000;
        s1.name = "이이름";
        s1.major = "컴퓨터과학";

        s1.study();
    }
}
