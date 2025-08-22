package org.koreait.exam03;

import org.junit.jupiter.api.Test;
import org.koreait.exam03.beans.Message;
import org.koreait.exam03.configs.AppCtx2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class); // 객체 생성 -> 의존 설정 -> 초기화
        
        ctx.close(); // 소멸 단계
    }

    @Test
    void test2() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class);
        Message m1 = ctx.getBean(Message.class);

        Message m2 = ctx.getBean(Message.class);

        System.out.println(m1 == m2);
        ctx.close();
    }
}
