package org.koreait.member.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/member")
public class MemberController {

    @ResponseBody
    @GetMapping("/test")
    public String test() {
        return "테스트!";
    }
}
