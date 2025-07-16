package org.koreait.board.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.koreait.global.entities.BaseEntity;
import org.koreait.member.entities.Member;

@Data
@Entity
@Table(indexes = @Index(name="idx_board_data_created_at", columnList = "createdAt DESC"))
public class BoardData extends BaseEntity {
    @Id
    @GeneratedValue
    private Long seq;

    @ManyToOne
    @JoinColumn(name="mSeq")
    private Member member;

    @Column(nullable = false)
    private String subject;

    @Lob
    @Column(nullable = false)
    private String content;

    @Column(length=45, nullable = false)
    private String poster;
}
