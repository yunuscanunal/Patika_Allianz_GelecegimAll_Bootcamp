package com.allianz.erpsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table
@Data
@AttributeOverride(name = "uuid", column = @Column(name = "customer_uuid"))
public class CustomerEntity extends BaseEntity{

    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String email;
    @Column
    private String tc;
}