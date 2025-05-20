package org.koreait.member.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.koreait.member.validators.JoinValidator;
import org.koreait.member.validators.JoinValidator2;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final JoinValidator joinValidator;


    /**
     * MemberController에서 공통으로 공유할수 있는  속성
     *
     * @return
     */
//    @ModelAttribute("commonTitle")
//    public String commonTitle() {
//        return "회원 공통 제목...";
//    }
//
//    @ModelAttribute("hobbies")
//    public List<String> hobbies() {
//        return List.of("취미1", "취미2", "취미3");
//    }

    @GetMapping("/join")
    public String join(@ModelAttribute RequestJoin form) {
        System.out.println(form);

        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs(@Valid RequestJoin form, Errors errors) { // requestJoin`
        joinValidator.validate(form, errors);

        if (errors.hasErrors()) { // 검증 실패
            return "member/join";
        }

        // 회원가입 완료 후 로그인 페이지 이동
        return "redirect:/member/login";
    }

    @GetMapping("/login")
    public String login() {

        return "member/login";
    }

    @PostMapping("/login")
    public String loginPs() {

        return "member/login";
    }
}
