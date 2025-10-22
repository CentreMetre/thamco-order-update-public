package com.thamco.shop.order.update.service;

import com.thamco.shop.order.update.model.Order;

public interface OrderService
{
    /**
     * Marks the order as fulfilled by adding a time to the fulfilled property
     * @param order the order to mark as fulfilled
     * @return the order that got marked as fulfilled
     */
    Order markOrderAsFulfilled(Order order);
}
