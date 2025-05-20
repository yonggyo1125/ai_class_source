package org.koreait.member.validators;

import org.koreait.member.controllers.RequestJoin;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class JoinValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(RequestJoin.class);
    }

    @Override
    public void validate(Object target, Errors errors) {

        // Bean Validation API를 이용한 커맨드 객체 검증에 실패한 경우
        if (errors.hasErrors()) {
            return;
        }

        /**
         * 1. 중복 회원 체크
         * 2. 비밀번호 확인
         */

        RequestJoin form = (RequestJoin) target;

        // 2. 비밀번호 확인
        String password = form.getPassword();
        String confirmPassword = form.getConfirmPassword();
        if (!password.equals(confirmPassword)) {

        }
    }
}
