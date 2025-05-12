package org.koreait.board.services;

import org.koreait.board.entities.Board;

import java.util.List;
import java.util.stream.IntStream;

public class BoardInfoService {

    public List<Board> getList() {
        List<Board> items = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> Board.builder()
                        .seq(i)
                        .subject("제목" + i)
                        .build()
                ).toList();
        return items;
    }
}
