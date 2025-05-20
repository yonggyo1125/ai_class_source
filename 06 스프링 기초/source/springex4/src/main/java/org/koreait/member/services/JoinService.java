package org.koreait.member.services;

import lombok.RequiredArgsConstructor;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.entities.Member;
import org.koreait.member.repositories.MemberRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class JoinService {
    private final MemberRepository repository;

    public void process(RequestJoin form) {

        String hash = BCrypt.hashpw(form.getPassword(), BCrypt.gensalt(12));

        Member member = new Member();
        member.setEmail(form.getEmail());
        member.setPassword(hash);
        member.setName(form.getName());
        member.setMobile(form.getMobile());
        member.setRegDt(LocalDateTime.now());

        repository.save(member);
    }
}
