package org.koreait.member.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Member {


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

    @Column(nullable = false, length=45)
    private String name;

    @Lob
    private String introduction;

    private LocalDateTime createdAt;
}
