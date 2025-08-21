package org.koreait.exam02.configs;

import org.koreait.exam02.member.services.JoinService;
import org.koreait.exam02.member.services.LoginService;
import org.koreait.exam02.member.validators.JoinValidator;
import org.koreait.exam02.member.validators.LoginValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DbConfig.class)
public class AppCtx {



    @Bean
    public JoinValidator joinValidator() {
        return new JoinValidator();
    }

    @Bean
    public LoginValidator loginValidator() {
        return new LoginValidator();
    }

//    @Bean
//    @Qualifier("L2")
//    public LoginValidator loginValidator2() {
//        return new LoginValidator();
//    }

    @Bean
    public JoinService joinService() {
        return new JoinService();
    }

    @Bean
    public LoginService loginService() {

        return new LoginService();
    }
}
