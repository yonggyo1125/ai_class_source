package org.koreait.configs;

import org.koreait.member.dao.MemberDao;
import org.koreait.person.Greeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DBConfig {
    /*
    @Bean
    public MemberDao memberDao() {
        System.out.println("수동 등록빈!");
        return new MemberDao();
    }
    */
    @Bean
    public Greeter dataSource() {
        return new Greeter();
    }
}
