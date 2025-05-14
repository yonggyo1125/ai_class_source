package org.koreait.configs;

import org.koreait.member.dao.MemberDao;
import org.koreait.member.services.JoinService;
import org.koreait.member.services.LoginService;
import org.koreait.member.validators.JoinValidator;
import org.koreait.member.validators.LoginValidator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

import java.time.format.DateTimeFormatter;

@Configuration
//@Import(DBConfig.class)
//@ComponentScan({"org.koreait.member", "org.koreait.configs"})
//@ComponentScan("org.koreait")

//@ComponentScan(basePackages = "org.koreait",
//        excludeFilters = @ComponentScan.Filter(type=FilterType.ANNOTATION, classes = ManualBean.class))
@ComponentScan(basePackages = "org.koreait",
    excludeFilters = @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, classes=MemberDao.class))
public class AppCtx2 {

    //@Bean
    public DateTimeFormatter dateTimeFormatter() {
        return DateTimeFormatter.ofPattern("yy.MM.dd HH:mm");
    }

    /*
    @Bean
    @Qualifier("dtf2")
    public DateTimeFormatter dateTimeFormatter2() {
        return DateTimeFormatter.ofPattern("yyyy.MM.dd");
    } */
}
