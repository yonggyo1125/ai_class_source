package org.koreait.member.controllers;

import jakarta.validation.Valid;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/member")
public class MemberController {

    @PostMapping("/join")
    public void join(@RequestBody @Valid RequestJoin form, Errors errors) {

        if (errors.hasErrors()) {
            errors.getFieldErrors().stream().forEach(e -> System.out.println(e.getDefaultMessage()));
        }

        System.out.println(form);
    }
}
