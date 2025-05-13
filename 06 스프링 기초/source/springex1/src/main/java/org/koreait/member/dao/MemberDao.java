package org.koreait.member.dao;

import org.koreait.member.entities.Member;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberDao {
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
