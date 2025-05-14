package org.koreait.member.services;

import lombok.RequiredArgsConstructor;
import org.koreait.member.RequestLogin;
import org.koreait.member.dao.MemberDao;
import org.koreait.member.entities.Member;
import org.koreait.member.validators.LoginValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final LoginValidator validator;

    //@Autowired
    //private MemberDao memberDao;

    private final Optional<MemberDao> opt;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd");

    //@Autowired(required = false)
    //@Qualifier("dtf2")
    @Autowired
    public void setFormatter(@Nullable DateTimeFormatter formatter) {
        System.out.println("setFormatter()");
        this.formatter = formatter;
    }

    public void process(RequestLogin form) {
        validator.validate(form);
        MemberDao memberDao = opt.orElse(null);
        if (memberDao == null) {
            return;
        }

        Member member = memberDao.get(form.getEmail());
        if (member != null && formatter != null) {
            String dateStr = formatter.format(member.getRegDt());
            member.setRegDtStr(dateStr);
        }

        System.out.println(member);
        System.out.println("로그인 완료");
    }
}
