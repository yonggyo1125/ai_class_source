package org.koreait.tests;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.board.entities.BoardData;
import org.koreait.board.entities.HashTag;
import org.koreait.board.repositories.BoardDataRepository;
import org.koreait.board.repositories.HashTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Transactional
@ActiveProfiles({"default", "test"})
public class Ex09 {
    @Autowired
    private BoardDataRepository boardDataRepository;

    @Autowired
    private HashTagRepository hashTagRepository;

    @PersistenceContext
    private EntityManager em;

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

        em.clear();
    }

    @Test
    void test1() {
        BoardData item = boardDataRepository.findById(1L).orElse(null);
        List<HashTag> tags = item.getTags();
        tags.forEach(System.out::println);
    }

    @Test
    void test2() {
       HashTag tag = hashTagRepository.findById("태그1").orElse(null);
       List<BoardData> items = tag.getItems();
       items.forEach(System.out::println);
    }
}
