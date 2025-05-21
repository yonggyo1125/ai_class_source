package org.koreait.member.exceptions;

import org.koreait.global.exceptions.NotFoundException;

public class MemberNotFoundException extends NotFoundException {
    public MemberNotFoundException() {
        super("회원을 찾을수 없습니다.");
    }
}
