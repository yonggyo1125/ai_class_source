package org.koreait.member.repositories;

import org.koreait.member.entities.Member;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

public interface MemberRepository extends ListCrudRepository<Member, Long> {
    default boolean existsByEmail(String email) {
        return exists(email) > 0;
    }

    @Query("SELECT COUNT(*) FROM MEMBER WHERE email=:email")
    int exists(@Param("email") String email);
}
