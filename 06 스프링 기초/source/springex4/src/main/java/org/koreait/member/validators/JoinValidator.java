package org.koreait.member.validators;

import org.koreait.member.controllers.RequestJoin;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class JoinValidator implements Validator {

    // 검증하는 커맨드 객체 한정
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(RequestJoin.class);
    }

    // 검증
    @Override
    public void validate(Object target, Errors errors) {
        /**
         * 1. 필수 항목 검증 (이메일, 비밀번호, 비밀번호 확인, 회원명, 약관 동의)
         * 2. 비밀번호 자리수 검증(8자리 이상)
         * 3. 중복 가입 여부 체크
         * 4. 비밀번호 확인
         */
        RequestJoin form = (RequestJoin)target;

        boolean agree = form.isAgree();

        // 1. 필수 항목 검증 S
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "Required", "이메일을 입력하세요.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "Required", "비밀번호를 입력하세요.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "Required", "비밀번호를 확인하세요.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "Required","회원명을 입력하세요.");

        // 1. 필수 항목 검증 E
    }
}
