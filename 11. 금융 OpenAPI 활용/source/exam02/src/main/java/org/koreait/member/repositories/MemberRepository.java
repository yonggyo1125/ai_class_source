package org.koreait.member.repositories;

import org.koreait.member.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long>, QuerydslPredicateExecutor<Member> {
    //Member findByEmail(String email);
    Optional<Member> findByEmail(String email);

    List<Member> findByEmailContainingOrNameContaining(String email, String name);

    List<Member> findByEmailContainingOrNameContainingOrderByCreatedAtDesc(String email, String name);

    @Query("SELECT m FROM Member m WHERE m.email LIKE :e OR m.name LIKE :n ORDER BY m.createdAt DESC")
    List<Member> getContents(@Param("e") String email, @Param("n") String name);
}
