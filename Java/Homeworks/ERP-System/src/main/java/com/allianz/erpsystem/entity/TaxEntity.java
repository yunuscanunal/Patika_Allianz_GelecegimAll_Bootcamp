package com.allianz.erpsystem.entity;

import com.allianz.erpsystem.entity.BaseEntity;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table
@AttributeOverride(name = "uuid", column = @Column(name = "tax_uuid"))
@Data
public class TaxEntity extends BaseEntity {
    @Column
    private String type;
    @Column
    private BigDecimal percent;
}