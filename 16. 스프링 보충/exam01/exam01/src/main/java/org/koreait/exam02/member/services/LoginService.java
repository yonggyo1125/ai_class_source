package org.koreait.exam02.member.services;

import org.koreait.exam02.RequestLogin;
import org.koreait.exam02.member.repositories.MemberDao;
import org.koreait.exam02.member.validators.LoginValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

public class LoginService {
    private MemberDao memberDao;
    private LoginValidator validator;

    @Autowired
    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    //@Autowired(required = false)
    @Autowired
    //@Qualifier("L2")
    public void setValidator(@Nullable LoginValidator validator) {
        System.out.println("호출!");
        this.validator = validator;
    }

    public void process(RequestLogin form) {
        if (validator != null) {
            validator.check(form); // 로그인 정보 검증
        }

        memberDao.getMember(form.getEmail()); // 회원정보 조회

        System.out.println("로그인 처리.... 완료");
    }
}
