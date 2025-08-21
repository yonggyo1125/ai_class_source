package org.koreait.exam02;

import org.junit.jupiter.api.Test;
import org.koreait.exam02.configs.AppCtx;
import org.koreait.exam02.member.RequestJoin;
import org.koreait.exam02.member.services.JoinService;
import org.koreait.exam02.member.services.LoginService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        JoinService service = ctx.getBean(JoinService.class);
        RequestJoin form = new RequestJoin();
        form.setEmail("user01@test.org");
        form.setPassword("1234");
        form.setName("사용자01");

        service.process(form);

        ctx.close();
    }

    @Test
    void test2() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        LoginService service = ctx.getBean(LoginService.class);

        RequestLogin form = new RequestLogin();
        form.setEmail("user01@test.org");
        form.setPassword("1234");

        service.process(form);

        ctx.close();
    }
}
