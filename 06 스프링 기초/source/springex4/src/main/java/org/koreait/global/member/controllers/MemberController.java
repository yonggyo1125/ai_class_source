package org.koreait.global.member.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping("/member/register")
    public String joinPage() {

        return "member/join";
    }
}
