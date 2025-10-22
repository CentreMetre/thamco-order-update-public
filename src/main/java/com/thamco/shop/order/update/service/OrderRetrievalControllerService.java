package com.thamco.shop.order.update.service;

import com.thamco.shop.order.update.UpdateApplication;
import com.thamco.shop.order.update.exception.OrderRetrievalException;
import com.thamco.shop.order.update.model.Order;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

/**
 * Calls the retrieval service for any order required to be updated
 */
@Service
public class OrderRetrievalControllerService implements OrderRetrievalService
{
    private final Logger logger = Logger.getLogger(OrderRetrievalControllerService.class.getName());

    private final RestTemplate restTemplate;

    @Value(value = "${order.retrieval.domain}")
    private String retrievalUrl;

    @Value(value = "${order.retrieval.path}")
    private String retrievalPath;

    public OrderRetrievalControllerService(RestTemplate restTemplate)
    {
        this.restTemplate = restTemplate;
    }

    /**
     * Retrieves order from retrieval service by id
     * @param id the id of the order
     * @return The order
     */
    @Override
    @Transactional
    @Retry(name = "orderRetrievalControllerServiceRetry", fallbackMethod = "fallbackMethod")
    public Order retrieveOrderById(int id)
    {
        logger.info("in " + getClass().getName());
        String url = retrievalUrl + retrievalPath + "/" + id;
        UpdateApplication.logger.info("Retrieve order by id url: " + url);
        Order call = restTemplate.getForObject(url, Order.class);
        return call;
    }

    public Order fallbackMethod(int id, Throwable t)
    {
        logger.severe("Fallback method called. Reason: " + t.getMessage());
        throw new OrderRetrievalException("Failed to retrieve order with id " + id, t);
    }
}
