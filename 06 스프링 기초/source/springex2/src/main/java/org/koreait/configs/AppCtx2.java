package org.koreait.configs;

import org.koreait.proxy.Calculator;
import org.koreait.proxy.RecCalculator;
import org.koreait.proxy3.Performance3Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)  // 서브클래스 기반의 프록시로 변환
public class AppCtx2 {

    @Bean
    public Performance3Calculator performance3Calculator() {
        return new Performance3Calculator();
    }

    @Bean
    public RecCalculator recCalculator() {
        return new RecCalculator();
    }
}
