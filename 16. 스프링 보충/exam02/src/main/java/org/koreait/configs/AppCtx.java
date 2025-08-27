package org.koreait.configs;

import org.koreait.calculator.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppCtx {
    @Bean
    public RecCalculator  calculator() {
        return new RecCalculator();
    }

    @Bean
    public PerformanceCalculator2 performanceCalculator2() {
        return new PerformanceCalculator2();
    }
}
