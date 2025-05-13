package org.koreait.configs;

import org.koreait.person.Greeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {

    @Bean
    public Greeter greeter() {
        return new Greeter();
    }
}
