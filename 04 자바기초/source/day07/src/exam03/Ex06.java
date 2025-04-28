package exam03;

import exam01.Book;

public class Ex06 {
    public static void main(String[] args) throws ClassNotFoundException{
        //Class cls = Book.class;

        /*
        클래스 -> 메모리(코드 & 상수) 로드, 반환값이 Class 클래스 객체
         */
        Class cls = Class.forName("exam01.Book");
        System.out.println(cls);
    }
}
