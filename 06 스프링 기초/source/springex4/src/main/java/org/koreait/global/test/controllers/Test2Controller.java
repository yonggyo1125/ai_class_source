package org.koreait.global.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/test2")
public class Test2Controller {

    @GetMapping("/ex01")
    public String exam01(Model model) {
        model.addAttribute("programmings", List.of("자바", "파이썬", "자바스크립트", "러스트"));
        model.addAttribute("fruits", List.of("사과", "배", "오렌지", "바나나"));
        model.addAttribute("genders", Gender.values());

        return "test/test";
    }
}
