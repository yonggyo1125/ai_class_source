package org.koreait.member.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.koreait.member.services.JoinService;
import org.koreait.member.validators.JoinValidator;
import org.koreait.member.validators.JoinValidator2;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final JoinValidator joinValidator;
    private final JoinService joinService;

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

        // 회원 가입 검증 성공, 가입 처리
        joinService.process(form);

        // 회원가입 완료 후 로그인 페이지 이동
        return "redirect:/member/login";
    }

    @GetMapping("/login")
    public String login(@ModelAttribute RequestLogin form) {

        return "member/login";
    }

    @PostMapping("/login")
    public String loginPs(@Valid RequestLogin form, Errors errors) {

        if (errors.hasErrors()) {
            return "member/login";
        }


        // 로그인 성공시 이동
        String redirectUrl = form.getRedirectUrl();

        return "redirect:" + (StringUtils.hasText(redirectUrl) ? redirectUrl : "/");

    }

    // MemberController 공통 적용 Validator
//    @InitBinder
//    public void InitBinder(WebDataBinder binder) {
//        binder.setValidator(joinValidator);
//    }
}
