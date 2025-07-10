package org.koreait.member.entities;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Member {
    private Long seq;
    private String email;
    private String password;
    private String name;
    private LocalDateTime createdAt;
}
