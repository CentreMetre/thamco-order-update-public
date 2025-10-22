package com.thamco.shop.order.update.model;

import java.util.List;

/**
 * DTO class for order requests that come in to be able to map to an Order and an OrderItem
 */
public class OrderRequest
{
    private int userId;

    private List<OrderItem> orderItems;

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public List<OrderItem> getOrderItems()
    {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems)
    {
        this.orderItems = orderItems;
    }
}
