package org.koreait.test.controllers;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test3")
@RequiredArgsConstructor
public class Test3Controller {
    private final HttpServletRequest request;
    private final HttpServletResponse response;

    @ResponseBody
    @GetMapping("/sub/ex01")
    public void exam1() {
        Cookie cookie1 = new Cookie("key1", "value1");
        response.addCookie(cookie1);
    }

    @ResponseBody
    @GetMapping("/sub2/ex01")
    public void exam2() {
        Cookie cookie1 = new Cookie("key2", "value2");
        response.addCookie(cookie1);
    }

    @ResponseBody
    @GetMapping("/sub3")
    public void exam3(@CookieValue(name="key3", required = false) String value) {
        System.out.printf("key3:%s%n", value);

//        // /spring/test3
//        Cookie cookie = new Cookie("key3", "value3");
//        cookie.setPath(request.getContextPath() + "/test3");
//        response.addCookie(cookie);
    }

    @ResponseBody
    @GetMapping("/sub3/ex01")
    public void exam4() {
        // /spring/test3
//        Cookie cookie = new Cookie("key4", "value4");
//        cookie.setPath(request.getContextPath() + "/test3");
//        cookie.setMaxAge(60 * 60 * 24 * 7); //쿠키의 만료 시간을 7일
//        //cookie.setMaxAge(0); // 쿠키의 만료 시간 1970.1.1, 쿠키 삭제
//        cookie.setHttpOnly(true); // 자바스크립트에서 조회 불가
//        response.addCookie(cookie);
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            System.out.printf("name=%s, value=%s%n", cookie.getName(), cookie.getValue());
        }
    }
}
