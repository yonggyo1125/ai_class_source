package org.koreait.member.services;

import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.validators.JoinValidator;

public class JoinService  {

    private JoinValidator validator;

    public JoinService(JoinValidator validator) {
        this.validator = validator;
    }

    public void process(RequestJoin form) {
        validator.check(form);

    }
}
