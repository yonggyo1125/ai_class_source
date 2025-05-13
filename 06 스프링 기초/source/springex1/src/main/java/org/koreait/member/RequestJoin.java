package org.koreait.member;

import lombok.Data;

@Data
public class RequestJoin {
    private String email;
    private String password;
    private String name;
}
