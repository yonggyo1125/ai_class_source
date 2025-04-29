package exam01;

@MyAnno(value="안녕1", min=20, max={200, 300, 400})
public class Ex01 {

    @MyAnno(value="안녕2")
    public Ex01() {

    }

    @MyAnno("안녕3")
    void method() {

    }
}
