package com.thamco.shop.order.update.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

@Entity
@Table(name = "ORDERS")
public class Order
{
    //private static int idCounter = 0;

    /**
     * The ID of the order
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    /**
     * The ID of the user that placed the order
     */
    @NotNull
    private int userId;

    /**
     * The time the order was created
     */
    @NotNull(message = "Creation date cannot be null")
    private LocalDateTime createdAt;

    /**
     * The total price of the oder in pence
     */
    private int amountInPence;

    /**
     * Null by default, changes to the time it has been fulfilled when it has been fulfilled
     */
    private LocalDateTime fulfilled = null;

    public @NotNull LocalDateTime getCreatedAt()
    {
        return createdAt;
    }

    public void setCreatedAt(@NotNull LocalDateTime createdAt)
    {
        this.createdAt = createdAt;
    }

    public int getAmountInPence()
    {
        return amountInPence;
    }

    public void setAmountInPence(int amountInPence)
    {
        this.amountInPence = amountInPence;
    }

    public LocalDateTime getFulfilled()
    {
        return fulfilled;
    }

    public void setFulfilled(LocalDateTime fulfilled)
    {
        this.fulfilled = fulfilled;
    }

    @NotNull
    public int getUserId()
    {
        return userId;
    }

    public void setUserId(@NotNull int userId)
    {
        this.userId = userId;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "ID: " + id + "\n userId: " + userId + "\n localDateTime: " + createdAt + "\n amountInPence: " + amountInPence;
    }
}
