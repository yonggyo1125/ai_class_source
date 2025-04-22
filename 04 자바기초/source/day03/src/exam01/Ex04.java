package exam01;

public class Ex04 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "이이름", "컴퓨터과학");
        Student s2 = new Student(1001, "김이름", "컴퓨터과학");

        s1.study();
        s2.study();

        s1.id = 1002;
        s1.staticMethod();

        System.out.println(s1.NUM);
    }
}
