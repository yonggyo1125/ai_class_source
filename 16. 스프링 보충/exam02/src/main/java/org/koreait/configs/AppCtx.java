package org.koreait.configs;

import org.koreait.calculator.Calculator;
import org.koreait.calculator.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppCtx {
    @Bean
    public Calculator calculator() {
        return new RecCalculator();
    }
}
