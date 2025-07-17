package org.koreait.member.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class MemberProfile {
    @Id
    @GeneratedValue
    private Long seq;

    private String profileInfo;
    private String profileImage;
}
