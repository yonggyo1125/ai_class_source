package org.koreait.member;

import lombok.Data;

@Data
public class RequestLogin {
    private String email;
    private String password;
}
