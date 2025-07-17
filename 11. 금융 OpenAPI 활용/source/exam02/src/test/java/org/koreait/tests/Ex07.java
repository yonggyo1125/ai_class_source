package org.koreait.tests;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.board.entities.BoardData;
import org.koreait.board.entities.QBoardData;
import org.koreait.board.repositories.BoardDataRepository;
import org.koreait.member.constants.Authority;
import org.koreait.member.entities.Member;
import org.koreait.member.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Transactional
@ActiveProfiles({"default", "test"})
public class Ex07 {
    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private BoardDataRepository boardDataRepository;

    @PersistenceContext
    private EntityManager em;

    @Autowired
    private JPAQueryFactory queryFactory;


    @BeforeEach
    void init() {
        Member member = new Member();
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
        member.setName("사용자01");
        member.setAuthority(Authority.MEMBER);

        memberRepository.saveAndFlush(member);

        List<BoardData> items = new ArrayList<>();
        for (long i = 1; i <= 10; i++) {
            BoardData item = new BoardData();
            item.setMember(member);
            item.setSubject("제목" + i);
            item.setContent("내용" + i);
            item.setPoster("작성자" + i);
            items.add(item);
        }

        boardDataRepository.saveAllAndFlush(items);

        em.clear(); // 영속성을 비워야 캐시된 쪽에서 가져오는게 아니라 직접 SQL 실행
    }

    @Test
    void test1() {
        BoardData item = boardDataRepository.findById(1L).orElse(null);

        Member member = item.getMember();
        String email = member.getEmail();
        System.out.println(email);
        //System.out.println(item);

    }

    @Test
    void test2() {
        Member member = memberRepository.findById(1L).orElse(null);
        List<BoardData> items = member.getItems();
        items.forEach(System.out::println);
    }

    @Test
    void test3() {
        List<BoardData> items = boardDataRepository.findAll();
        for (BoardData item : items) {
            Member member = item.getMember();
            String email = member.getEmail();
            String name = member.getName();
            System.out.printf("email=%s, name=%s%n", email, name);
        }
    }

    @Test
    void test4() {
        List<BoardData> items = boardDataRepository.getList();
        for (BoardData item : items) {
            Member member = item.getMember();
            String email = member.getEmail();
            String name = member.getName();
            System.out.printf("email=%s, name=%s%n", email, name);
        }
    }

    @Test
    void test5() {
        List<BoardData> items = boardDataRepository.getList2(); // Fetch Join
        for (BoardData item : items) {
            Member member = item.getMember();
            String email = member.getEmail();
            String name = member.getName();
            System.out.printf("email=%s, name=%s%n", email, name);
        }
    }

    @Test
    void test6() {
        QBoardData boardData = QBoardData.boardData;
        List<BoardData> items = queryFactory.selectFrom(boardData)
                .leftJoin(boardData.member)
                .fetchJoin()
                .fetch();

        for (BoardData item : items) {
            Member member = item.getMember();
            String email = member.getEmail();
            String name = member.getName();
            System.out.printf("email=%s, name=%s%n", email, name);
        }
    }

    @Test
    void test7() {
        List<BoardData> items = boardDataRepository.findBySubjectContaining("제목");
        for (BoardData item : items) {
            Member member = item.getMember();
            String email = member.getEmail();
            String name = member.getName();
            System.out.printf("email=%s, name=%s%n", email, name);
        }
    }
}
