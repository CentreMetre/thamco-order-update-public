package com.thamco.shop.order.update.service;

import com.thamco.shop.order.update.model.Order;
import com.thamco.shop.order.update.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class OrderControllerService implements OrderService
{
    private final OrderRepository orderRepository;

    public OrderControllerService(OrderRepository orderRepository)
    {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order markOrderAsFulfilled(Order order)
    {
        order.setFulfilled(LocalDateTime.now());
        orderRepository.save(order);
        return order;
    }
}
