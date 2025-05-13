package org.koreait.test.member;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.koreait.global.exceptions.BadRequestException;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.services.JoinService;
import org.koreait.member.validators.JoinValidator;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("회원가입기능 테스트")
public class JoinServiceTest {

    private JoinService service;

    @BeforeEach
    void init() {
        service = new JoinService(new JoinValidator());
    }

    private RequestJoin getSuccessData() {
        Faker faker = new Faker(Locale.KOREAN);
        String password = faker.regexify("\\w{8,}");
        return RequestJoin.builder()
                .email(faker.internet().emailAddress())
                .name(faker.name().fullName())
                .password(password)
                .confirmPassword(password)
                .build();
    }

    /**
     * 검증 실패에 대한 데이터 생성
     *
     * @param field
     * @param value
     * @return
     */
    private RequestJoin getFailureData(String field, String value) {
        RequestJoin obj = getSuccessData();
        for (Method method : RequestJoin.class.getDeclaredMethods()) {
            String name = method.getName();
            if (name.equalsIgnoreCase("set" + field)) {
                try {
                    method.invoke(obj, value);
                } catch (Exception e) {}
                break;
            }
        }

        return obj;
    }

    @Tag("success")
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
        Map<String, String> messages = Map.of("email", "이메일", "password", "비밀번호", "confirmPassword", "비밀번호를 확인", "name", "회원명");
        for (String field : List.of("email", "password", "confirmPassword", "name")) {
            String message = messages.get(field);
            assertAll(
                    () -> {
                        BadRequestException thrown = assertThrows(BadRequestException.class, () -> {
                            service.process(getFailureData(field, null));
                        });
                        
                        // 발생한 예외의 문구를 체크
                        assertTrue(thrown.getMessage().contains(message));
                    },
                    () -> {
                        BadRequestException thrown = assertThrows(BadRequestException.class, () -> {
                            service.process(getFailureData(field, "   "));
                        });

                        // 발생한 예외의 문구를 체크
                        assertTrue(thrown.getMessage().contains(message));
                    }
            );
        }
    }

    @Test
    @DisplayName("이메일이 이미 가입되어 있다면 BadRequestException 발생")
    void duplicatedEmailTest() {

    }

    @Test
    @DisplayName("비밀번호 확인 일치 하지 않으면 BadRequestException 발생")
    void passwordConfirmTest() {

    }
}
