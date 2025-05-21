package org.koreait.survey.controllers;

import org.koreait.member.entities.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/survey")
@SessionAttributes({"requestSurvey", "member"})
public class SurveyController {

    @ModelAttribute("requestSurvey")
    public RequestSurvey requestSurvey() {
        return new RequestSurvey();
    }

    @ModelAttribute("member")
    public Member getMember() {
        return new Member();
    }

    @GetMapping("/page1")
    public String page1(Model model) {
        Member member = getMember();
        member.setName("page1에서 설정");
        // 속성 값 member는 session 속성으로 추가
        model.addAttribute("member", member);

        return "survey/page1";
    }

    @PostMapping("/page2")
    public String page2(RequestSurvey form) {

        System.out.println("page2:" + form);

        return "survey/page2";
    }

    @PostMapping("/page3")
    public String page3(RequestSurvey form) {
        System.out.println("page3:" + form);

        return "survey/page3";
    }

    @PostMapping("/done")
    public String surveyPs(@SessionAttribute(name="member", required=false) Member member, RequestSurvey form, SessionStatus status) {
        System.out.println("done:" + form);
        System.out.println("member:" + member);
        // 커맨드 객체 처리 완료 후 완료 표기, 더이상 세션 값으로 추가 X
        status.setComplete();

        return "survey/done";
    }
}
