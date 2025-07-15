package org.koreait.member.repositories;

import org.koreait.member.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    //Member findByEmail(String email);
    Optional<Member> findByEmail(String email);

    List<Member> findByEmailContainingOrNameContaining(String email, String name);
}
