package com.allianz.erpsystem.entity;

import com.allianz.erpsystem.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table
@AttributeOverride(name = "uuid", column = @Column(name = "product_uuid"))
@Data
public class ProductEntity extends BaseEntity {
    @Column
    private String name;
    @Column
    private BigDecimal nonTaxAppliedPrice = BigDecimal.ZERO;
    @Column
    private Boolean isTaxApplied;
    @Column
    private BigDecimal price;
    @Column
    private Integer stock;
    @Column
    private int orderCount;
    @ManyToOne
    @JoinColumn(name = "tax_id")
    private TaxEntity tax;
}
