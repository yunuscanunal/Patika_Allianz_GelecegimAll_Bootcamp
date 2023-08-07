package com.allianz.erpsystem.controller;

import com.allianz.erpsystem.entity.OrderEntity;
import com.allianz.erpsystem.dto.OrderDTO;
import com.allianz.erpsystem.service.OrderService;
import com.allianz.erpsystem.util.OrderStatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping
    public ResponseEntity<List<OrderEntity>> getAll() {
        return new ResponseEntity<>(orderService.getAll(), HttpStatus.OK);
    }

    @GetMapping("get/{status}")
    public ResponseEntity<List<OrderEntity>> getByStatus(@PathVariable String status) {
        OrderStatusEnum status2 = null;
        for (OrderStatusEnum status1 : OrderStatusEnum.values()) {
            if (status1.name().equals(status.toUpperCase())) {
                status2 = status1;
                break;
            }
        }
        return new ResponseEntity<>(orderService.getByStatus(status2), HttpStatus.OK);
    }

    @GetMapping("get/{uuid}")
    public ResponseEntity<OrderEntity> getByUuid(@PathVariable UUID uuid) {
        return new ResponseEntity<>(orderService.getByUuid(uuid), HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity<Boolean> createOrder(@RequestBody OrderDTO orderDTO) {
        return new ResponseEntity<>(orderService.createOrder(orderDTO.getCustomerEntity(),
                orderDTO.getProductEntityList()), HttpStatus.CREATED);
    }

    @PutMapping("update/{uuid}")
    public ResponseEntity<Boolean> updateOrder(@PathVariable UUID uuid, @RequestBody OrderDTO orderDTO) {
        OrderEntity order = new OrderEntity();
        order.setCustomer(orderDTO.getCustomerEntity());
        order.setProductList(orderDTO.getProductEntityList());
        return new ResponseEntity<>(orderService.updateOrderEntity(uuid, order), HttpStatus.OK);
    }

    @Modifying
    @Transactional
    @DeleteMapping("delete/{uuid}")
    public ResponseEntity<Boolean> deleteOrder(@PathVariable UUID uuid) {
        return new ResponseEntity<>(orderService.deleteOrderEntity(uuid), HttpStatus.OK);
    }

    @PostMapping("add-product/{productUuid}-to-{orderUuid}")
    public ResponseEntity<Boolean> addProduct(@PathVariable UUID productUuid, @PathVariable UUID orderUuid) {
        return new ResponseEntity<>(orderService.addProduct(productUuid, orderUuid), HttpStatus.OK);
    }

    @PostMapping("approve/{orderUuid}")
    public ResponseEntity<OrderEntity> approveOrder(@PathVariable UUID orderUuid) {
        return new ResponseEntity<>(orderService.controlOrderStatus(orderUuid), HttpStatus.OK);
    }
}
