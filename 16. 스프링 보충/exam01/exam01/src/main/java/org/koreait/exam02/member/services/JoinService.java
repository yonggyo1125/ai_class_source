package org.koreait.exam02.member.services;

import lombok.RequiredArgsConstructor;
import org.koreait.exam02.member.RequestJoin;
import org.koreait.exam02.member.repositories.MemberDao;
import org.koreait.exam02.member.validators.JoinValidator;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {


    private final MemberDao memberDao;

    private final JoinValidator validator;


    public void process(RequestJoin form) {
        validator.check(form); // 검증의 역할

        memberDao.register(form); // 데이터베이스 영구 저장

        System.out.println("회원가입 완료");
    }
}
