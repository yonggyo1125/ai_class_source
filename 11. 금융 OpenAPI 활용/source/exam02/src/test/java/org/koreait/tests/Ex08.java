package org.koreait.tests;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.BeforeEach;
import org.koreait.member.entities.Member;
import org.koreait.member.entities.MemberProfile;
import org.koreait.member.repositories.MemberProfileRepository;
import org.koreait.member.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"default", "test"})
public class Ex08 {
    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private MemberProfileRepository profileRepository;

    @Autowired
    private EntityManager em;

    @BeforeEach
    void init() {
        MemberProfile profile = new MemberProfile();
        profile.setProfileInfo("프로필 정보");
        profile.setProfileImage("프로필 이미지...");
        profileRepository.saveAndFlush(profile);


        Member member = new Member();
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
        member.setName("사용자01");
        member.setProfile(profile);
        memberRepository.saveAndFlush(member);

        em.clear();
    }
}
