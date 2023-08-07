package com.allianz.erpsystem.dto;

import com.allianz.erpsystem.entity.CustomerEntity;
import com.allianz.erpsystem.entity.ProductEntity;
import com.allianz.erpsystem.util.OrderStatusEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class OrderDTO {
    private UUID uuid;
    private CustomerEntity customerEntity;
    private List<ProductEntity> productEntityList = new ArrayList<>();
    private OrderStatusEnum status = OrderStatusEnum.WAITING;
    public OrderDTO() {
        this.uuid = UUID.randomUUID();
    }
}
