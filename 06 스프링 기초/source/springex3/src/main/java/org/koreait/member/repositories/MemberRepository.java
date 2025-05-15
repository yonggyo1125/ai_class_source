package org.koreait.member.repositories;

import org.koreait.member.entities.Member;
import org.springframework.data.repository.ListCrudRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface MemberRepository extends ListCrudRepository<Member, Long> {
    Optional<Member> findByEmail(String email);
    List<Member> findByRegDtBetweenOrderByRegDtDesc(LocalDateTime sdate, LocalDateTime eDate);
}
