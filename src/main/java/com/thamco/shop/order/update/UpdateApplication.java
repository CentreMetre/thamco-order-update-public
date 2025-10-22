package com.thamco.shop.order.update;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

/**
 * Entry point for the update service.
 */
@SpringBootApplication
public class UpdateApplication {

	public static final Logger logger = Logger.getLogger(UpdateApplication.class.getName());
	public static void main(String[] args)
	{
		SpringApplication.run(UpdateApplication.class, args);
	}
}
