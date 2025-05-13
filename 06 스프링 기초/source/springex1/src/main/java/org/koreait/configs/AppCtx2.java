package org.koreait.configs;

import org.koreait.member.dao.MemberDao;
import org.koreait.member.services.JoinService;
import org.koreait.member.services.LoginService;
import org.koreait.member.validators.JoinValidator;
import org.koreait.member.validators.LoginValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx2 {

    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public JoinValidator joinValidator() {
        return new JoinValidator();
    }

    @Bean
    public LoginValidator loginValidator() {
        return new LoginValidator();
    }

    @Bean
    public JoinService joinService() {
        JoinService service = new JoinService();
        service.setMemberDao(memberDao());
        service.setValidator(joinValidator());

        return service;
    }

    @Bean
    public LoginService loginService() {
        return new LoginService(loginValidator(), memberDao());
    }
}
