package org.koreait.member.entities;

import lombok.Data;

@Data
public class Member {
    private long seq;
    private String email;
    private String password;
    private String name;
}
