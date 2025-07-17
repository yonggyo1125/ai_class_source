package org.koreait.board.repositories;

import org.koreait.board.entities.BoardData;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface BoardDataRepository extends JpaRepository<BoardData, Long>, QuerydslPredicateExecutor<BoardData> {

    @EntityGraph(attributePaths = "member")
    List<BoardData> findBySubjectContaining(String keyword);

    @Query("SELECT b FROM BoardData b LEFT JOIN b.member")
    List<BoardData> getList();

    @Query("SELECT b FROM BoardData b LEFT JOIN FETCH b.member")
    List<BoardData> getList2();
}
