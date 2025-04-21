package exam03;

public class Student {
    int id; // 학번
    String name; // 이름
    String major; // 전공

    void study() {
        System.out.printf("id:%d, name:%s, major: %s%n", id, name, major);
    }
}