package com.allianz.erpsystem.entity;

import com.allianz.erpsystem.entity.OrderEntity;
import com.allianz.erpsystem.util.OrderStatusEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@AttributeOverride(name = "uuid", column = @Column(name = "order_uuid"))
@Data
public class OrderEntity extends BaseEntity {
    @OneToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;
    @ManyToMany
    @JoinColumn(name = "product_id")
    private List<ProductEntity> productList = new ArrayList<>();
    @Column
    private OrderStatusEnum status = OrderStatusEnum.WAITING;
    @Column
    private BigDecimal totalPrice;
}
