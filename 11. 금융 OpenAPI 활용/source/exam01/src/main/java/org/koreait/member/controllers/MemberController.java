package org.koreait.member.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/member")
public class MemberController {

    @PostMapping("/join")
    public void join(@RequestBody RequestJoin form) {
        System.out.println(form);
    }
}
