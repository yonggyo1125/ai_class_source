package org.koreait.member.controllers;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class MemberSearch {
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate sDate;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate eDate;
}
