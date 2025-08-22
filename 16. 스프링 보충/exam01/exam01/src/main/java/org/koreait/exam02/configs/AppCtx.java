package org.koreait.exam02.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//@ComponentScan(basePackages = "org.koreait",
//        excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes = ManualBean.class))
//@ComponentScan(basePackages = "org.koreait",
//    excludeFilters = @ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE, classes = JoinValidator.class))
@ComponentScan(basePackages = "org.koreait",
    excludeFilters = @ComponentScan.Filter(type= FilterType.ASPECTJ, pattern = "org.koreait..*Validator"))
public class AppCtx {

}
