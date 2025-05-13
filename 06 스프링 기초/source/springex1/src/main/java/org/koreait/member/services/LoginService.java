package org.koreait.member.services;

import org.koreait.member.RequestLogin;
import org.koreait.member.dao.MemberDao;
import org.koreait.member.entities.Member;
import org.koreait.member.validators.LoginValidator;

public class LoginService {
    private LoginValidator validator;
    private MemberDao memberDao;


    public void process(RequestLogin form) {
        validator.validate(form);
        Member member = memberDao.get(form.getEmail());

        System.out.println(member);
        System.out.println("로그인 완료");
    }
}
