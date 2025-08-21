package org.koreait.exam02.member.services;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.koreait.exam02.RequestLogin;
import org.koreait.exam02.member.repositories.MemberDao;
import org.koreait.exam02.member.validators.LoginValidator;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final MemberDao memberDao;
    @NonNull
    private LoginValidator validator;


    public void process(RequestLogin form) {
        if (validator != null) {
            validator.check(form); // 로그인 정보 검증
        }

        memberDao.getMember(form.getEmail()); // 회원정보 조회

        System.out.println("로그인 처리.... 완료");
    }
}
