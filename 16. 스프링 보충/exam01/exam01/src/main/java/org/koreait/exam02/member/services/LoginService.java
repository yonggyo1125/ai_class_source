package org.koreait.exam02.member.services;

import org.koreait.exam02.RequestLogin;
import org.koreait.exam02.member.repositories.MemberDao;
import org.koreait.exam02.member.validators.LoginValidator;

public class LoginService {
    private MemberDao memberDao;
    private LoginValidator validator;

    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public void setValidator(LoginValidator validator) {
        this.validator = validator;
    }

    public void process(RequestLogin form) {
        validator.check(form); // 로그인 정보 검증

        memberDao.getMember(form.getEmail()); // 회원정보 조회

        System.out.println("로그인 처리.... 완료");
    }
}
