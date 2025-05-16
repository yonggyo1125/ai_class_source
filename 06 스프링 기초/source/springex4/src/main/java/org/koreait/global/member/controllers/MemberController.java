package org.koreait.global.member.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {

    @GetMapping("/member/register")
    public String joinPage(Model model) {

        model.addAttribute("message", "안녕하세요.");
        return "member/join"; // /WEB-INF/templates/member/join.jsp -> ModelAndView 변환
    }

    /*
    @GetMapping("/member/register")
    public ModelAndView joinPage() {
        ModelAndView mv = new ModelAndView();

        mv.addObject("message", "안녕하세요.");
        mv.setViewName("member/join");

        return mv;
    }
     */
}
