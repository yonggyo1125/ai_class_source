package org.koreait.global.member.controllers;

import lombok.Data;

import java.util.List;

@Data
public class RequestJoin3 {
    private String email;
    private String password;
    private String confirmPassword;
    private String name;
    private String mobile;
    private boolean agree;

    private RequestAddress addr;

    private List<String> hobby;
}
