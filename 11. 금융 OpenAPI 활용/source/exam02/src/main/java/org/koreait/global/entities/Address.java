package org.koreait.global.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Address {
    @Column(length=10)
    private String zonecode;

    @Column(length=100)
    private String address;

    @Column(length=100)
    private String addressSub;
}
