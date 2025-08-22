package org.koreait.exam02.member.repositories;

import org.koreait.exam02.member.RequestJoin;
import org.springframework.stereotype.Repository;

//@ManualBean
@Repository
public class MemberDao {
    public void register(RequestJoin form) {
        System.out.println("DB 저장");
    }

    public void getMember(String email) {
        System.out.println("회원정보 조회 성공");
    }
}
