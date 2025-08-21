package org.koreait.exam02.configs;

import org.koreait.exam02.member.repositories.MemberDao;
import org.koreait.exam02.member.services.JoinService;
import org.koreait.exam02.member.validators.JoinValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {

    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public JoinValidator joinValidator() {
        return new JoinValidator();
    }

    @Bean
    public JoinService joinService() {
        return new JoinService(memberDao(), joinValidator());
    }
}
