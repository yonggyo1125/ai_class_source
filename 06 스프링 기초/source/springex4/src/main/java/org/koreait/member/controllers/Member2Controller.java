package org.koreait.member.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member2")
public class Member2Controller {

    @GetMapping // /member
    public String index() {
        return "member/test";
    }

    @GetMapping("/join")  // /member/join
    public String joinPage() {

        return "member/join"; // 템플릿 경로
    }

    @PostMapping("/join") // /member/join
    public String joinPs(RequestJoin3 form, Model model) { // requestJoin
        //model.addAttribute("requestJoin", form);

        return "member/join";
    }

    /*
    @PostMapping("/member/join")
    public String joinPs(
            @RequestParam(name="email", defaultValue = "기본 이메일...") String email,
            @RequestParam("password") String password,
            @RequestParam("confirmPassword") String confirmPassword,
            @RequestParam(name="agree", required = false) Boolean agree) {
        System.out.println("POST 요청 유입...");
        System.out.printf("email=%s, agree=%s%n", email, agree);

        return "member/join_ps";
    }
    */

    /*
    @GetMapping("/member/register")
    public String joinPage(@RequestParam("agree") boolean agree, @RequestParam("email") String email, Model model) {
        System.out.printf("agree:%s, email:%s%n", agree, email);
        model.addAttribute("message", "안녕하세요.");
        return "member/join"; // /WEB-INF/templates/member/join2.jsp -> ModelAndView 변환
    }
    */

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
