package org.koreait.configs;

import org.koreait.member.dao.MemberDao;
import org.koreait.member.services.JoinService;
import org.koreait.member.services.LoginService;
import org.koreait.member.validators.JoinValidator;
import org.koreait.member.validators.LoginValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.time.format.DateTimeFormatter;

@Configuration
//@Import(DBConfig.class)
//@ComponentScan({"org.koreait.member", "org.koreait.configs"})
@ComponentScan("org.koreait")
public class AppCtx2 {

    @Bean
    public DateTimeFormatter dateTimeFormatter() {
        return DateTimeFormatter.ofPattern("yy.MM.dd HH:mm");
    }
}
