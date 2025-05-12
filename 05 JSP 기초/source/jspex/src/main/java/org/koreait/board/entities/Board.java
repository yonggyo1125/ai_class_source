package org.koreait.board.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Board {
    private long seq;
    private String subject;
}
