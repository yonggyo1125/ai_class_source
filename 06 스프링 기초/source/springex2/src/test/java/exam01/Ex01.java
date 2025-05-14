package exam01;

import org.junit.jupiter.api.Test;
import org.koreait.configs.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class); // 객체생성 -> 의존주입 -> 초기화(afterPropertiesSet())

        ctx.close();  // destroy() -> 소멸
    }
}
