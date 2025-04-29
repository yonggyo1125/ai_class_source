package exam01;

@MyAnno(min=10, max=100)
public class Ex01 {

    @MyAnno(min=1, max=10)
    public Ex01() {

    }

    @MyAnno(min=5, max=20)
    void method() {

    }
}
