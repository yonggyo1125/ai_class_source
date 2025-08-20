package org.koreait.exam01;

import org.koreait.exam01.configs.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Greeter g1 = ctx.getBean("greeter", Greeter.class);

        Greeter g2 = ctx.getBean("greeter", Greeter.class);

        g1.message("이이름");
        System.out.println(g1 == g2);
        ctx.close();
    }
}
