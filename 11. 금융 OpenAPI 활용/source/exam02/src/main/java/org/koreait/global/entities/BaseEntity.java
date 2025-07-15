package org.koreait.global.entities;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@MappedSuperclass // 공통 속성으로 사용될 상위 클래스임을 알려주는 애노테이션
public abstract class BaseEntity {

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
