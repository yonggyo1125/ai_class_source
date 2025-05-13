package org.koreait.member.services;

import org.koreait.member.RequestLogin;
import org.koreait.member.dao.MemberDao;
import org.koreait.member.entities.Member;
import org.koreait.member.validators.LoginValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class LoginService {
    @Autowired
    private LoginValidator validator;

    @Autowired
    private MemberDao memberDao;

    private DateTimeFormatter formatter;

    @Autowired
    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public void process(RequestLogin form) {
        validator.validate(form);
        Member member = memberDao.get(form.getEmail());
        if (member != null) {
            String dateStr = formatter.format(member.getRegDt());
            member.setRegDtStr(dateStr);
        }

        System.out.println(member);
        System.out.println("로그인 완료");
    }
}
