package com.allianz.erpsystem.dto;

import com.allianz.erpsystem.entity.TaxEntity;
import com.allianz.erpsystem.entity.OrderEntity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class ProductDTO {
    private UUID uuid;
    private String name;
    private BigDecimal nonTaxAppliedPrice;
    private Boolean isTaxApplied;
    private BigDecimal price;
    private Integer stock;
    private TaxEntity tax;
    private OrderEntity order;
    public ProductDTO() {
        this.uuid = UUID.randomUUID();
    }
}
