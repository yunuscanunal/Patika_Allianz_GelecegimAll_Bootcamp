package com.allianz.erpsystem.service;

import com.allianz.erpsystem.entity.CustomerEntity;
import com.allianz.erpsystem.entity.OrderEntity;
import com.allianz.erpsystem.entity.ProductEntity;
import com.allianz.erpsystem.repository.OrderRepository;
import com.allianz.erpsystem.repository.ProductRepository;
import com.allianz.erpsystem.util.OrderStatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ProductService productService;

    // Yeni şipariş oluşturuldu.

    public boolean createOrder(CustomerEntity customer, List<ProductEntity> productEntityList) {
        if (customer == null || productEntityList == null) {
            return false;
        } else {
            OrderEntity orderEntity = new OrderEntity();
            orderEntity.setCustomer(customer);
            orderEntity.setProductList(productEntityList);
            orderRepository.save(orderEntity);
            return true;
        }
    }

    public List<OrderEntity> getAll() {
        return orderRepository.findAll();
    }

    public List<OrderEntity> getByStatus(OrderStatusEnum orderStatusEnum) {
        return OrderRepository.getOrderEntitiesByStatus(orderStatusEnum);
    }

    public OrderEntity getByUuid(UUID uuid) {
        return orderRepository.findByUuid(uuid);
    }

    // UUID' ye göre sipariş güncellendi.

    public boolean updateOrderEntity(UUID uuid, OrderEntity orderEntity) {
        if (uuid == null || orderEntity == null) {
            return false;
        } else {
            OrderEntity existCustomerOrder = orderRepository.findByUuid(uuid);
            if (existCustomerOrder == null) {
                return true;
            } else {
                existCustomerOrder.setCustomer(orderEntity.getCustomer());
                existCustomerOrder.setProductList(orderEntity.getProductList());
                existCustomerOrder.setStatus(orderEntity.getStatus());

                orderRepository.save(existCustomerOrder);
                return true;
            }
        }
    }

    // UUID'ye göre sipariş silindi.

    public boolean deleteOrderEntity(UUID uuid) {
        if (uuid == null) {
            return false;
        } else {
            orderRepository.deleteByUuid(uuid);
            return true;
        }
    }

    // Sipariş için ürün eklemesi yapıldı.

    public boolean addProduct(UUID orderUuid, UUID productUuid) {
        if (orderUuid == null || productUuid == null || productRepository.findByUuid(productUuid).getOrderCount == 0)
            return false;
        else {
            OrderEntity existingCustomerOrder = orderRepository.findByUuid(orderUuid);
            productRepository.findByUuid(productUuid).setOrderCount(1);
            if (existingCustomerOrder == null)
                return false;
            ProductEntity product = (ProductEntity) productRepository.findByUuid(productUuid);
            if (existingCustomerOrder.getProductList().contains(product))
            {
                for (ProductEntity productEntity : existingCustomerOrder.getProductList()) {
                    if (productEntity.getUuid().equals(productUuid))
                        productEntity.setOrderCount(productEntity.getOrderCount() + 1);
                }
            } else
                existingCustomerOrder.getProductList().add(product);
            orderRepository.save(existingCustomerOrder);
            return true;
        }
    }

    // Siparişin toplam tutarı hesaplandı.

    public void calculateTotalPrice(UUID uuid) {
        OrderEntity orderEntity = orderRepository.findByUuid(uuid);
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (ProductEntity productEntity : orderEntity.getProductList()) {
            BigDecimal productPrice = productEntity.getPrice().multiply(BigDecimal.valueOf(productEntity.getOrderCount()));
            totalPrice = totalPrice.add(productPrice);
        }
        orderEntity.setTotalPrice(totalPrice);
        orderRepository.save(orderEntity);
    }

    // Sipariş durumu incelendi.

    public OrderEntity controlOrderStatus(UUID orderUuid) {
        OrderEntity order = orderRepository.findByUuid(orderUuid);
        if (order == null)
            return null;
        if (order.getStatus() == OrderStatusEnum.WAITING) {
            for (ProductEntity productEntity : order.getProductList()) {
                if (productEntity.getStockCount() < productEntity.getOrderCount()) {
                    order.setStatus(OrderStatusEnum.REJECTED);
                    orderRepository.save(order);
                    return order;
                } else {
                    order.setStatus(OrderStatusEnum.APPROVED);
                    productEntity.setStockCount(productEntity.getStockCount() - productEntity.getOrderCount());
                    orderRepository.save(order);
                }
            }
        }
        calculateTotalPrice(orderRepository.findByUuid(orderUuid).getUuid());
        return order;
    }

}
