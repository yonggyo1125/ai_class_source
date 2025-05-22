package org.koreait.member.controllers;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MemberSearch {
    private LocalDate sDate;
    private LocalDate eDate;
}
