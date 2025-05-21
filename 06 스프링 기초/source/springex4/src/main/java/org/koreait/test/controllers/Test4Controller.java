package org.koreait.test.controllers;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.koreait.member.entities.Member;
import org.koreait.member.repositories.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test4")
@RequiredArgsConstructor
public class Test4Controller {
    private final HttpSession session;
    private final MemberRepository repository;

    @ResponseBody
    @GetMapping("/ex01")
    public void exam01() {
        Member member = repository.findByEmail("user01@test.org").orElse(null);
        session.setAttribute("member", member);
    }

    @ResponseBody
    @GetMapping("/ex02")
    public void exam02() {
        Member member = (Member)session.getAttribute("member");
        System.out.println(member);
    }
}
