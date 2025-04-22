package exam01;

public class Student {
    int id; // 학번
    String name; // 이름
    String major; // 전공과목

    /**
     * 기본 생성자
     * - 정의가 안되어 있으면 public Student() {}
     */
    /*
    public Student() {
        // 객체 생성 이후에 실행되는 코드..
        /**
         * 객체 생성 이후에는 변수 공간에 값을 최초로 넣어주는 초기화 작업을 주로 진행
         *
         */
/*
        id = 1000;
        name = "이이름";
        major = "컴퓨터 과학";
    }
    */
    public Student() {

    }

    public Student(int _id, String _name, String _major) {
        id = _id;
        name = _name;
        major = _major;
    }

    void study() {
        System.out.printf("id=%d, name=%s, major=%s%n", id, name, major);
    }
}
