package org.koreait.member.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
public class MemberProfile {
    @Id
    @GeneratedValue
    private Long seq;

    @ToString.Exclude
    @OneToOne(mappedBy = "profile", fetch= FetchType.LAZY)
    private Member member;

    private String profileInfo;
    private String profileImage;
}
