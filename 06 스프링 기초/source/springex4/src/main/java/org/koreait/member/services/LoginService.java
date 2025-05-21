package org.koreait.member.services;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.koreait.member.controllers.RequestLogin;
import org.koreait.member.entities.Member;
import org.koreait.member.exceptions.MemberNotFoundException;
import org.koreait.member.repositories.MemberRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository repository;
    private final HttpSession session;
    private final HttpServletResponse response;


    public void process(RequestLogin form) {
        /**
         * 1. 회원 정보를 조회
         * 2. 세션에 회원정보를 유지(로그인 처리)
         * 3. 이메일 기억하기 처리
         */

        String email = form.getEmail();

        // 1. 회원 정보를 조회
        Member member = repository.findByEmail(email).orElseThrow(MemberNotFoundException::new);

        // 2. 세션에 회원정보를 유지(로그인 처리)
        session.setAttribute("loggedMember", member);

        // 3. 이메일 기억하기 처리
        Cookie cookie = new Cookie("savedEmail", email);
        if (form.isSaveEmail()) { // 이메일 쿠키 저장 처리
            cookie.setMaxAge(60 * 60 * 24 * 7);
        } else { // 이메일 쿠키 삭제 처리
            cookie.setMaxAge(0);
        }

        response.addCookie(cookie);
    }
}
