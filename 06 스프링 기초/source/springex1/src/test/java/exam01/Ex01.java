package exam01;

import org.junit.jupiter.api.Test;
import org.koreait.configs.AppCtx;
import org.koreait.person.Greeter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {

    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        //Greeter g1 = ctx.getBean("greeter", Greeter.class);
        Greeter g1 = ctx.getBean(Greeter.class);
        Greeter g2 = ctx.getBean("greeter", Greeter.class);
        System.out.println(g1 == g2);
        //g1.hello("안녕하세요.");



        ctx.close();

    }
}
