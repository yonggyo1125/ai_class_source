package org.koreait.board.repositories;

import org.koreait.board.entities.BoardData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface BoardDataRepository extends JpaRepository<BoardData, Long>, QuerydslPredicateExecutor<BoardData> {

    @Query("SELECT b FROM BoardData b LEFT JOIN Member m")
    List<BoardData> getList();
}
