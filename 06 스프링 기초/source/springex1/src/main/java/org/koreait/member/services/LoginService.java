package org.koreait.member.services;

import org.koreait.member.RequestLogin;
import org.koreait.member.dao.MemberDao;
import org.koreait.member.validators.LoginValidator;

public class LoginService {
    private LoginValidator validator;
    private MemberDao memberDao;

    public LoginService(LoginValidator validator, MemberDao memberDao) {
        this.memberDao = memberDao;
        this.validator = validator;
    }

    public void process(RequestLogin form) {
        validator.validate(form);

        System.out.println("로그인 완료");
    }
}
