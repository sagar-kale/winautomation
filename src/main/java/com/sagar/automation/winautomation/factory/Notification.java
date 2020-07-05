package com.sagar.automation.winautomation.factory;

import org.springframework.web.client.RestTemplate;

public abstract class Notification {
    protected String createdNotification;
    private RestTemplate restTemplate = new RestTemplate();

    public void sendMessage(String message) {
        String response = restTemplate.getForObject(buildMessage(message), String.class);
        System.out.println(response);
    }

    protected void setCreatedNotification(String createdNotification) {
        this.createdNotification = createdNotification;
    }

    private String buildMessage(String message) {
        return String.format(createdNotification, message);
    }

    public Notification() {
        this.createNotification();
    }

    protected abstract void createNotification();
}
