package org.koreait.global.member.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @RequestMapping(path={"/member/test1", "/member/test2"}, method= RequestMethod.GET)
    public String test1() {
        return "member/test";
    }

    @GetMapping(path="/member/test3", params = {"param1", "param2"})
    public String test3() { // 쿼리스트링값으로 ?param1=...&param2=...
        System.out.println("param1, param2");
        return "member/test";
    }

    @GetMapping(path="/member/test3", params = {"param3", "param4"})
    public String test4() { // 쿼리스트링값으로 ?param3=...&param4=...
        System.out.println("param3, param4");
        return "member/test";
    }
}
