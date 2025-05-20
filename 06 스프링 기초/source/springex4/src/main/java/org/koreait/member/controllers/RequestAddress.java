package org.koreait.member.controllers;

import lombok.Data;

@Data
public class RequestAddress {
    private String zoneCode;
    private String address;
    private String addressSub;
}
