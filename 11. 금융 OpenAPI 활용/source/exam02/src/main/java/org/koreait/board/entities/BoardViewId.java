package org.koreait.board.entities;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class BoardViewId {
    private Long seq;
    private int uid;
}
