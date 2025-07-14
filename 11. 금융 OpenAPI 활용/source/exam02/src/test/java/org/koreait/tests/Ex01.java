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
public class Ex01 {

    @PersistenceContext
    private EntityManager em;

//    @BeforeEach
//    void init() {
//        em.getTransaction().begin();
//    }
//
//    @AfterEach
//    void after() {
//        em.getTransaction().commit();
//    }
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

        member.setName("(수정)사용자01"); // update
        em.flush(); // update

        em.remove(member); // 삭제 X, 제거 상태로 영속 상태를 변경
        em.flush(); // delete
    }

    @Test
    void test2() {
        Member member = new Member();
        member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
        member.setName("사용자01");
        member.setCreatedAt(LocalDateTime.now());

        em.persist(member); // 영속 상태로 만들기, 엔티티의 변화감지를 할수 있도록 만든것
        em.flush(); // 변화 상태를 DB에 영구 반영

        em.detach(member); // 영속성 분리, 변화감지 X

        member.setName("(수정)사용자01"); // update
        //em.flush(); // update

        // 분리된 엔티티의 차이점을 비교하기 위해서 SELECT 쿼리가 한번 실행

        member.setPassword("(수정)12345678");
        //em.flush();

        em.merge(member); // 분리된 영속성 상태 -> 다시 영속 상태 변경(변화 감지)

        em.flush();
    }
}
