package org.koreait.test.member;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.global.exceptions.BadRequestException;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.services.JoinService;
import org.koreait.member.validators.JoinValidator;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("회원가입기능 테스트")
public class JoinServiceTest {

    private JoinService service;

    @BeforeEach
    void init() {
        service = new JoinService(new JoinValidator());
        System.out.println(getSuccessData());
    }

    private RequestJoin getSuccessData() {
        Faker faker = new Faker(Locale.KOREAN);
        return RequestJoin.builder()
                .email(faker.internet().emailAddress())
                .name(faker.name().fullName())
                .password("12345678")
                .confirmPassword("12345678")
                .build();
    }

    @Test
    @DisplayName("회원을 가입을 성공한 경우 예외가 발생하지 않는다.")
    void successTest() {
        assertDoesNotThrow(() -> {
            service.process(getSuccessData());
        });
    }

    @Test
    @DisplayName("필수항목(이메일, 비밀번호, 비밀번호 확인, 회원명)이 입력되지 않았을 때 BadRequestException이 발생한다.")
    void requiredFieldValidationTest() {
            assertThrows(BadRequestException.class, () -> {

                //service.process(form);
            });

    }
}
