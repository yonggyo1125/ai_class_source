package org.koreait.exam02.member.validators;

import org.koreait.exam02.RequestLogin;
import org.springframework.stereotype.Component;

@Component
public class LoginValidator {
    public void check(RequestLogin form) {
        System.out.println("로그인 정보 검증 완료");
    }
}
