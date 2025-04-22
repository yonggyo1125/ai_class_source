package exam01;

import java.lang.reflect.Method;

public class Ex05 {
    public static void main(String[] args) {
        Student.id = 1000;
        System.out.println(Student.id);

        Class cls = Student.class;
        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method);
        }

    }
}
