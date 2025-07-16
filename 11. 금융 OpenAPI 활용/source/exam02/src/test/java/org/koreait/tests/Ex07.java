package org.koreait.tests;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.BeforeEach;
import org.koreait.board.entities.BoardData;
import org.koreait.board.repositories.BoardDataRepository;
import org.koreait.member.constants.Authority;
import org.koreait.member.entities.Member;
import org.koreait.member.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@ActiveProfiles({"default", "test"})
public class Ex07 {
    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private BoardDataRepository boardDataRepository;

    @PersistenceContext
    private EntityManager em;

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
    }
}
