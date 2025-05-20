package exam03;

import org.junit.jupiter.api.Test;
import org.koreait.global.configs.DBConfig;
import org.koreait.global.configs.MvcConfig;
import org.koreait.member.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

@SpringJUnitWebConfig(MvcConfig.class)
public class Ex02 {
    @Autowired
    private MemberRepository repository;

    @Test
    void test1() {
        boolean result = repository.existsByEmail("user011111@test.org");
        System.out.println(result);
    }
}
