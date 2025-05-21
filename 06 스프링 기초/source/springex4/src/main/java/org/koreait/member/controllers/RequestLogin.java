package org.koreait.member.controllers;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RequestLogin {
    @NotBlank
    private String email;

    @NotBlank
    private String password;
    private boolean saveEmail; // 이메일 기억하기

    private String redirectUrl; // 로그인 성공시 이동할 주소
}
