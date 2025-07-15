package org.koreait.member.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="kit_member",
        indexes = {
            @Index(name="idx_member_created_at", columnList = "createdAt DESC"),
                @Index(name="uq_member_email_name", columnList = "email, name", unique = true)
        })

public class Member {


//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//    private String seq;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long seq;

    @Column(nullable = false, length=80)
    private String email;

    @Column(name="passwd", nullable = false, length=65)
    private String password;

    @Column(nullable = false, length=45)
    private String name;

    @Lob
    private String introduction;

    private LocalDateTime createdAt;
}
