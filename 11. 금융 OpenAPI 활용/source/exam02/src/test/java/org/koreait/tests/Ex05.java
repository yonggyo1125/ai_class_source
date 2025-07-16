package org.koreait.tests;

import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.member.constants.Authority;
import org.koreait.member.entities.Member;
import org.koreait.member.entities.QMember;
import org.koreait.member.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@ActiveProfiles({"default", "test"})
public class Ex05 {

    @Autowired
    private JPAQueryFactory queryFactory;

    @Autowired
    private MemberRepository repository;

    @BeforeEach
    void init() {
        List<Member> members = new ArrayList<>();
        for (long i = 1; i <= 10; i++) {
            Member member = new Member();
            member.setName("사용자" + i);
            member.setPassword("11111111");
            member.setAuthority(Authority.MEMBER);
            member.setEmail("user" + i + "@test.org");
            members.add(member);
        }
        repository.saveAllAndFlush(members);
    }

    @Test
    void test1() {
        QMember member = QMember.member;

        JPAQuery<Member> query = queryFactory.selectFrom(member)
                .where(member.email.contains("user"))
                .where(member.name.contains("사용자"))
                .orderBy(member.createdAt.desc());

        List<Member> members = query.fetch();
        members.forEach(System.out::println);
    }

    @Test
    void test2() {
        QMember member = QMember.member;
        JPAQuery<Long> query = queryFactory.select(member.count()).from(member);
        long total = query.fetchOne();
        System.out.println(total);
    }

    @Test
    void test3() {
        QMember member = QMember.member;
        JPAQuery<String> query = queryFactory.select(member.email).from(member);
        List<String> emails = query.fetch();
        System.out.println(emails);
    }

    @Test
    void test4() {
        QMember member = QMember.member;
        JPAQuery<Tuple> query = queryFactory.select(member.email, member.name).from(member);
        for (Tuple item : query.fetch()) {
            String email = item.get(member.email);
            String name = item.get(1, String.class);
            System.out.printf("email=%s, name=%s%n", email, name);
        }
    }
}
