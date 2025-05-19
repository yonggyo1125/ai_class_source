package org.koreait.global.member.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.print.attribute.standard.RequestingUserName;

@Controller
@RequestMapping("/member")
public class MemberController {

    /**
     * MemberController에서 공통으로 공유할수 있는  속성
     *
     * @return
     */
    @ModelAttribute("commonTitle")
    public String commonTitle() {
        return "회원 공통 제목...";
    }

    @GetMapping("/join")
    public String join(@ModelAttribute RequestJoin form) {
        System.out.println(form);

        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs(RequestJoin form) { // requestJoin`

        return "member/join";
    }
}
