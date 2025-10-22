package com.thamco.shop.order.update.web;

import com.thamco.shop.order.update.UpdateApplication;
import com.thamco.shop.order.update.model.Order;
import com.thamco.shop.order.update.service.OrderItemService;
import com.thamco.shop.order.update.service.OrderRetrievalService;
import com.thamco.shop.order.update.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.logging.Logger;

@RestController
public class UpdateController
{
    private final Logger logger = Logger.getLogger(UpdateController.class.getName());

    private final OrderService orderService;
    private final OrderRetrievalService orderRetrievalService;

    //curl -X PUT http://localhost:58002/orders/update/fulfil/41

    @Autowired
    public UpdateController(OrderService orderService, OrderRetrievalService orderRetrievalService)
    {
        this.orderService = orderService;
        this.orderRetrievalService = orderRetrievalService;
    }

    /**
     * Updates when the order is fulfilled
     * @param orderId The id of the order to mark as fulfilled
     */
    @PutMapping("/orders/update/fulfil/{order_id}")
    public ResponseEntity<String> updateFulfillment(@PathVariable("order_id") int orderId)
    {
        logger.info("In updateFulfillment() in controller");
        Order order = orderRetrievalService.retrieveOrderById(orderId);
        orderService.markOrderAsFulfilled(order);

        return ResponseEntity.ok("Order successfully marked as fulfilled");
    }


}
