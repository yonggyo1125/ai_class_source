package org.koreait.member.controllers;

public record RequestJoin2(String email,
                           String password,
                           String confirmPassword,
                           String name,
                           boolean agree
) {}
