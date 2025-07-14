package org.koreait.tests;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.member.entities.Member;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class Ex01 {

    @PersistenceContext
    private EntityManager em;

    @BeforeEach
    void init() {
        em.getTransaction().begin();
    }

    @AfterEach
    void after() {
        em.getTransaction().commit();
    }
    @Test
    void test1() {

        Member member = new Member();
        member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
        member.setName("사용자01");
        member.setCreatedAt(LocalDateTime.now());

        em.persist(member); // 영속 상태로 만들기, 엔티티의 변화감지를 할수 있도록 만든것
        em.flush(); // 변화 상태를 DB에 영구 반영
    }
}
