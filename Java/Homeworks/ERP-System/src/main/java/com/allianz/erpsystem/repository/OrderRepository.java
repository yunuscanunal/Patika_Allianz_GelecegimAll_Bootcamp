package com.allianz.erpsystem.repository;

import com.allianz.erpsystem.entity.OrderEntity;
import com.allianz.erpsystem.util.OrderStatusEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
    void deleteByUuid(UUID uuid);
    OrderEntity findByUuid(UUID uuid);
    List<OrderEntity> getOrderEntitiesByStatus(OrderStatusEnum status);
}
