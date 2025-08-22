package org.koreait.exam02.member.validators;

import org.koreait.exam02.member.RequestJoin;
import org.springframework.stereotype.Component;

//@ManualBean
@Component
public class JoinValidator {
    public void check(RequestJoin form) {
        System.out.println("검증 완료");
    }
}
