package org.koreait.member.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.koreait.board.entities.BoardData;
import org.koreait.global.entities.Address;
import org.koreait.global.entities.BaseEntity;
import org.koreait.member.constants.Authority;

import java.util.List;

@Data
@Entity
//@Table(name="kit_member",
//        indexes = {
//            @Index(name="idx_member_created_at", columnList = "createdAt DESC"),
//                @Index(name="uq_member_email_name", columnList = "email, name", unique = true)
//        })
public class Member extends BaseEntity {


//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//    private String seq;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long seq;

    @Column(unique = true, nullable = false, length=80)
    private String email;

    @Column(name="passwd", nullable = false, length=65)
    private String password;

    //@Column(columnDefinition = "VARCHAR(45) NOT NULL")
    @Column(length=45, nullable = false)
    private String name;

    @Lob
    private String introduction;

    @Enumerated(EnumType.STRING)
    private Authority authority;

    @Embedded
    private Address address;

    @Transient // 엔티티로 관리되는 필드 X, 엔티티 클래스 내부에서만 사용할 목적
    private String profileImage;

    @ToString.Exclude
    @OneToMany(mappedBy = "member", fetch=FetchType.EAGER)
    private List<BoardData> items;

//    @Temporal(TemporalType.DATE)
//    private Date modifiedAt;
}
