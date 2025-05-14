package org.koreait.member.dao;

import org.koreait.configs.ManualBean;
import org.koreait.member.entities.Member;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ManualBean
@Repository
public class MemberDao { ///  빈의 이름 memberDao
    private Map<String, Member> members = new HashMap<>();

    public void register(Member member) {
        member.setRegDt(LocalDateTime.now());
        members.putIfAbsent(member.getEmail(), member);
    }

    public Member get(String email) {
        return members.get(email);
    }

    public List<Member> getList() {
        return new ArrayList<>(members.values());
    }
}
