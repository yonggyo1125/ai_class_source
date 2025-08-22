package org.koreait.exam03.configs;

import org.koreait.exam03.beans.Message;
import org.koreait.exam03.beans.Message2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppCtx2 {

    @Bean
    @Scope("prototype")
    public Message message() {
        System.out.println("객체 생성 - message()");
        return new Message();
    }

    @Bean(initMethod = "init", destroyMethod = "close")
    public Message2 message2() {
        System.out.println("객체 생성 - message2()");
        return new Message2();
    }
}
