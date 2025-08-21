package org.koreait.exam02.member;

import lombok.Data;

@Data
public class RequestJoin {
    private String email;
    private String password;
    private String name;
}
