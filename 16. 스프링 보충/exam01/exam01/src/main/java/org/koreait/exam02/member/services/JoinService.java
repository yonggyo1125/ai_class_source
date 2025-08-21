package org.koreait.exam02.member.services;

import org.koreait.exam02.member.RequestJoin;
import org.koreait.exam02.member.repositories.MemberDao;
import org.koreait.exam02.member.validators.JoinValidator;
import org.springframework.beans.factory.annotation.Autowired;

public class JoinService {

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private JoinValidator validator;


    public void process(RequestJoin form) {
        validator.check(form); // 검증의 역할

        memberDao.register(form); // 데이터베이스 영구 저장

        System.out.println("회원가입 완료");
    }
}
