package com.sagar.automation.winautomation.factory;

import com.sagar.automation.winautomation.api.CallmebotApi;
import com.sagar.automation.winautomation.enums.NotificationType;

public class Telegram extends Notification {
    @Override
    protected void createNotification() {
        String api = CallmebotApi.build(NotificationType.TELEGRAM);
        this.setCreatedNotification(api);
    }
}
