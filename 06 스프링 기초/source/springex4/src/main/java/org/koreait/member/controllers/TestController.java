package org.koreait.member.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping(path="/member/test4", produces = "application/json")
    public String test5() {

        return "member/test";
    }

    // 요청 헤더 중에서 test6이 포함된 경우
    @GetMapping(path="/member/test5", headers = "test6")
    public String test6() {
        System.out.println("test6()");

        return "member/test";
    }

    // 요청 헤더 중에서 test7이 포함된 경우
    @GetMapping(path="/member/test5", headers = "test7")
    public String test7() {
        System.out.println("test7()");

        return "member/test";
    }

    @PostMapping(path="/member/test6", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String test8() {
        System.out.println("test8()");

        return "member/test";
    }

    @PostMapping(path="/member/test6", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String test9() {
        System.out.println("test9()");

        return "member/test";
    }
}
