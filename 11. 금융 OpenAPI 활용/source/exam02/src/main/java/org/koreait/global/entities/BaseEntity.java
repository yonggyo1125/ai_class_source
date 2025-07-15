package org.koreait.global.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@MappedSuperclass // 공통 속성으로 사용될 상위 클래스임을 알려주는 애노테이션
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @CreatedDate
    @Column(updatable = false) // 생성일자는 최초 1번만 등록
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(insertable = false) // 수정일자는 최초에는 등록  X
    private LocalDateTime modifiedAt;
}
