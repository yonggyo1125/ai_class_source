package org.koreait.member.controllers;

import org.koreait.member.entities.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/api/v1/member")
public class MemberController {
    @GetMapping
    public List<Member> info() {
        List<Member> members = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> Member.builder()
                        .seq(Long.valueOf(i))
                        .email("user" + i + "@test.org")
                        .password("12345678")
                        .name("사용자" + i)
                        .createdAt(LocalDateTime.now())
                        .build()).toList();
        return members;
    }
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void info() {
//        System.out.println("info()");
//    }
//    public String info() {
//        return "반갑습니다.";
//    }
//    public Member info() {
//
//        return Member.builder()
//                .seq(1L)
//                .email("user01@test.org")
//                .name("사용자01")
//                .password("12345678")
//                .createdAt(LocalDateTime.now())
//                .build();
//    }
}


