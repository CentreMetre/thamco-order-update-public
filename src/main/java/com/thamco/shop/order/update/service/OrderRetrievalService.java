package com.thamco.shop.order.update.service;

import com.thamco.shop.order.update.model.Order;

public interface OrderRetrievalService
{
    /**
     * Retrieve the order to update
     * @param id the id of the order
     * @return the order object
     */
    public Order retrieveOrderById(int id);
}
