package org.koreait.tests;

import org.junit.jupiter.api.BeforeEach;
import org.koreait.board.entities.BoardData;
import org.koreait.board.entities.HashTag;
import org.koreait.board.repositories.BoardDataRepository;
import org.koreait.board.repositories.HashTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class Ex09 {
    @Autowired
    private BoardDataRepository boardDataRepository;

    @Autowired
    private HashTagRepository hashTagRepository;

    @BeforeEach
    void init() {
        List<HashTag> tags = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            HashTag tag = new HashTag();
            tag.setTag("태그" + i);
            tag.setDescription("태그 설명...");
            tags.add(tag);
        }

        hashTagRepository.saveAllAndFlush(tags);

        List<BoardData> items = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            BoardData item = new BoardData();
            item.setSubject("제목" + i);
            item.setContent("내용" + i);
            item.setPoster("작성자" + i);
            item.setTags(tags);
            items.add(item);
        }
        boardDataRepository.saveAllAndFlush(items);

    }
}
