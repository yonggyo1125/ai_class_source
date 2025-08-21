package org.koreait.exam02.configs;

import org.koreait.exam02.member.repositories.MemberDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfig {
    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }
}
