package org.koreait.test.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test1")
public class Test1Controller {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private HttpServletResponse response;

    @Autowired
    private HttpSession session;



    @ResponseBody
    @GetMapping("/ex01")
    public void exam01(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        String URI = request.getRequestURI();
        System.out.println(URI);

        System.out.printf("request: %s, response: %s, session: %s%n", request, response, session);
    }

    @ResponseBody
    @GetMapping("/ex02")
    public void exam02() {
        String URI = request.getRequestURI();
        System.out.println(URI);

        System.out.printf("request: %s, response: %s, session: %s%n", request, response, session);
    }
}
