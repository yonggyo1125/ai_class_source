package org.koreait.member.repositories;

import org.koreait.member.entities.Member;
import org.springframework.data.repository.ListCrudRepository;

public interface MemberRepository extends ListCrudRepository<Member, Long> {
    Member findByEmail(String email);
}
