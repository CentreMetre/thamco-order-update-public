package com.thamco.shop.order.update.repository;

import com.thamco.shop.order.update.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>
{

}
