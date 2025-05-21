package org.koreait.member.validators;

import com.sun.net.httpserver.Request;
import lombok.RequiredArgsConstructor;
import org.koreait.member.controllers.RequestLogin;
import org.koreait.member.entities.Member;
import org.koreait.member.repositories.MemberRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class LoginValidator implements Validator {

    private final MemberRepository repository;

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(RequestLogin.class);
    }

    @Override
    public void validate(Object target, Errors errors) {

        if (errors.hasErrors()) {
            return;
        }

        /**
         * 1. 이메일로 회원이 조회되는 지
         * 2. 조회된 회원의 비밀번호가 일치하는지 체크
         */
        RequestLogin form = (RequestLogin) target;
        String email = form.getEmail();
        String password = form.getPassword();
        // 1. 이메일로 회원이 조회되는 지
        Member member = repository.findByEmail(email).orElse(null);
        if (member == null) {
           errors.reject("Invalid.login");
        }

        // 2. 조회된 회원의 비밀번호가 일치하는지 체크
        if (member != null && !BCrypt.checkpw(password, member.getPassword())) {
            errors.reject("Invalid.login");
        }
    }
}
