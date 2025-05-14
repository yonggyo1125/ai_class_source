package exam01;

import org.junit.jupiter.api.Test;
import org.koreait.configs.AppCtx;
import org.koreait.lifecycle.Message2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class); // 객체생성 -> 의존주입 -> 초기화(afterPropertiesSet())

        Message2 m1 = ctx.getBean(Message2.class);
        Message2 m2 = ctx.getBean(Message2.class);
        System.out.println(m1 == m2); // false

        ctx.close();  // destroy() -> 소멸
    }
}
