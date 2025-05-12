package org.koreait.member.controllers;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RequestJoin {
    private String email;
    private String password;
    private String confirmPassword;
    private String name;
}
