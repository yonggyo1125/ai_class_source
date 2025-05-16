package org.koreait.global.member.controllers;

import lombok.Data;

@Data
public class RequestJoin {
    private String email;
    private String password;
    private String confirmPassword;
    private String name;
    private boolean agree;
}
