package org.koreait.board.repositories;

import org.koreait.board.entities.HashTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HashTagRepository extends JpaRepository<HashTag, String> {

}
