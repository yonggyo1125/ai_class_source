package org.koreait.member.controllers;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.koreait.member.entities.Member;
import org.koreait.member.repositories.MemberRepository;
import org.koreait.member.services.JoinService;
import org.koreait.member.services.LoginService;
import org.koreait.member.validators.JoinValidator;
import org.koreait.member.validators.JoinValidator2;
import org.koreait.member.validators.LoginValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final JoinValidator joinValidator;
    private final JoinService joinService;

    private final LoginValidator loginValidator;
    private final LoginService loginService;

    private final MemberRepository repository;

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
    public String login(@ModelAttribute RequestLogin form,
                        @CookieValue(name="savedEmail", required = false) String email) {
        if (email != null) {
            form.setEmail(email);
            form.setSaveEmail(true);
        }

        return "member/login";
    }

    @PostMapping("/login")
    public String loginPs(@Valid RequestLogin form, Errors errors) {

        loginValidator.validate(form, errors);

        if (errors.hasErrors()) {
            return "member/login";
        }

        // 검증 성공시 로그인 처리
        loginService.process(form);

        // 로그인 성공시 이동
        String redirectUrl = form.getRedirectUrl();

        return "redirect:" + (StringUtils.hasText(redirectUrl) ? redirectUrl : "/");

    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate(); // 세션 비우기

        return "redirect:/member/login";

    }

    @ResponseBody
    @GetMapping("/info")
    public void memberInfo(@SessionAttribute(name="loggedMember", required = false) Member member) {
        System.out.println(member);
    }

    @GetMapping("/list")
    public String memberList(@ModelAttribute @Valid MemberSearch search, Errors errors, Model model) {
        LocalDate sDate = Objects.requireNonNullElse(search.getSDate(), LocalDate.now());
        LocalDate eDate = Objects.requireNonNullElse(search.getEDate(), LocalDate.now());

        LocalDateTime _sDate = sDate.atStartOfDay(); // 지정된 날짜의 자정
        LocalDateTime _eDate = eDate.atTime(23,59,59);

        List<Member> items = repository.findByRegDtBetween(_sDate, _eDate);
        model.addAttribute("items", items);

        return "member/list";
    }

    @ResponseBody
    @GetMapping({"/view/{seq}", "/view/info/{email}"})
    public void view(@PathVariable(name="seq", required = false) Long mSeq,
                     @PathVariable(name="email", required = false) String email) {
        System.out.println("seq:" + mSeq);
        System.out.println("email:" + email);
    }

    // MemberController 공통 적용 Validator
//    @InitBinder
//    public void InitBinder(WebDataBinder binder) {
//        binder.setValidator(joinValidator);
//    }
}
