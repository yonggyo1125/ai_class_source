package org.koreait.survey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/survey")
public class SurveyController {

    @GetMapping("/page1")
    public String page1(@ModelAttribute RequestSurvey form) {

        return "survey/page1";
    }

    @PostMapping("/page2")
    public String page2(RequestSurvey form) {

        System.out.println("page2:" + form);

        return "survey/page2";
    }
}
