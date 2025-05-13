package org.koreait.member.validators;

import org.koreait.global.validators.RequiredFieldValidator;
import org.koreait.global.validators.Validator;
import org.koreait.member.controllers.RequestJoin;

public class JoinValidator implements Validator<RequestJoin>, RequiredFieldValidator {
    @Override
    public void check(RequestJoin form) {
        String email = form.getEmail();
        String password = form.getPassword();
        String confirmPassword = form.getConfirmPassword();
        String name = form.getName();

        // 필수항목 검증 S
        checkString(email, "이메일을 입력하세요.");
        checkString(password, "비밀번호를 입력하세요.");
        checkString(confirmPassword, "비밀번호를 확인하세요.");
        checkString(name, "회원명을 입력하세요.");
        // 필수항목 검증 E
    }
}
