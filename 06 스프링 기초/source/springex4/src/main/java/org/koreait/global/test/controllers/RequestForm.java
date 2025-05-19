package org.koreait.global.test.controllers;

import lombok.Data;

import java.util.List;

@Data
public class RequestForm {
    private List<String> programming;
    private String fruit;
    private Gender gender;

}
