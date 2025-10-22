package com.thamco.shop.order.update;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Listener to get the port the application is running on, mainly for testing/development purposes.
 */
@Component
public class PortListener implements ApplicationListener<WebServerInitializedEvent> {

    private int serverPort;

    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        this.serverPort = event.getWebServer().getPort();
        System.out.println("Application is running on port: " + serverPort);
    }

    public int getServerPort() {
        return serverPort;
    }
}
