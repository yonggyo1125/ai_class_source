package org.koreait.test.controllers;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
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
    @GetMapping("/ex01")
    public void exam1() {
        Cookie cookie1 = new Cookie("key1", "value1");
        response.addCookie(cookie1);
    }
}
