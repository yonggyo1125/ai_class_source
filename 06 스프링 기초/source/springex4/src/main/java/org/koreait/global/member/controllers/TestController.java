package org.koreait.global.member.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @RequestMapping(path={"/member/test1", "/member/test2"}, method= RequestMethod.GET)
    public String test1() {
        return "member/test";
    }
}
