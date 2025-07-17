package org.koreait.member.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class MemberProfile {
    @Id
    @GeneratedValue
    private Long seq;

    @OneToOne(mappedBy = "profile", fetch= FetchType.LAZY)
    private Member member;

    private String profileInfo;
    private String profileImage;
}
