package org.koreait.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/test2")
public class Test2Controller {

    @GetMapping("/ex01")
    public String exam01(@ModelAttribute RequestForm form, Model model) {
        model.addAttribute("programmings", List.of("자바", "파이썬", "자바스크립트", "러스트"));
        model.addAttribute("fruits", List.of("사과", "배", "오렌지", "바나나"));
        model.addAttribute("genders", Gender.values());

        model.addAttribute("programmings2", getProgrammings());
        model.addAttribute("fruits2", getFruits());

        return "test/test";
    }

    public List<CodeValue> getProgrammings() {
        return List.of(
                new CodeValue("JAVA", "자바"),
                new CodeValue("PYTHON", "파이썬"),
                new CodeValue("JAVASCRIPT", "자바스크립트"),
                new CodeValue("RUST", "러스트")
        );
    }

    public List<CodeValue> getFruits() {
        return List.of(
             new CodeValue("APPLE", "사과"),
             new CodeValue("PEAR", "배"),
             new CodeValue("ORANGE", "오렌지"),
             new CodeValue("BANANA", "바나나")
        );
    }
}
