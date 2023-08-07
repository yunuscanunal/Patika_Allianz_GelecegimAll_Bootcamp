package com.allianz.erpsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class TaxDTO {
    private UUID uuid;
    private String type;
    private BigDecimal percent;
    public TaxDTO() {
        this.uuid = UUID.randomUUID();
    }
}