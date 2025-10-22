package com.thamco.shop.order.update.service;

import com.thamco.shop.order.update.model.Order;
import com.thamco.shop.order.update.model.OrderItem;
import com.thamco.shop.order.update.repository.OrderItemRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderItemControllerService implements OrderItemService
{
    private final OrderItemRepository orderItemRepository;

    public OrderItemControllerService(OrderItemRepository orderItemRepository)
    {
        this.orderItemRepository = orderItemRepository;
    }

}
