package org.koreait.tests;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.koreait.member.entities.Member;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Transactional
@SpringBootTest
public class Ex03 {
    @PersistenceContext
    private EntityManager em;

    @Test
    void test1() {
        Member member = new Member();
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
        member.setName("사용자01");
        member.setCreatedAt(LocalDateTime.now());

        em.persist(member);
        em.flush();

        System.out.println(member);
    }
}
