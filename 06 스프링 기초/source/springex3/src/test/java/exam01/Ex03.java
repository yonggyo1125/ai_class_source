package exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx;
import org.koreait.member.entities.Member;
import org.koreait.member.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.time.LocalDateTime;

@SpringJUnitConfig(AppCtx.class)
public class Ex03 {

    @Autowired
    private MemberRepository repository;

    @Test
    @DisplayName("새로운 엔티티를 추가")
    void test1() {
        Member member = new Member();
        member.setEmail("user97@test.org");
        member.setPassword("12345678");
        member.setName("사용자97");
        member.setMobile("01010001000");
        member.setRegDt(LocalDateTime.now());

        repository.save(member);

        System.out.println(member);
    }

    @Test
    @DisplayName("회원을 1명 조회하고 수정")
    void test2() {
        Member member = repository.findById(8L).orElse(null);
        System.out.println(member);

        member.setName("(수정)사용자97");

        repository.save(member);
    }
}
