package com.thamco.shop.order.update.exception;

public class OrderRetrievalException extends RuntimeException
{
    public OrderRetrievalException(String message, Throwable throwable)
    {
        super(message, throwable);
    }
}
