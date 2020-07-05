package com.sagar.automation.winautomation.api;

import com.sagar.automation.winautomation.enums.NotificationType;

public final class CallmebotApi {
    private static final String WHATSAPP_API = "https://api.callmebot.com/whatsapp.php";
    private static final String WHATSAPP_API_KEY = "675207";
    private static final String TELEGRAM_API = "http://api.callmebot.com/start.php?user=@sgrkale";

    private CallmebotApi() {
    }

    public static String build(NotificationType type) {
        StringBuilder builder = new StringBuilder();

        if (NotificationType.WHATSAPP == type) {
            builder.append(WHATSAPP_API)
                    .append("?phone=+919561609535&text=%s&apikey=")
                    .append(WHATSAPP_API_KEY);
        } else {
            builder.append(TELEGRAM_API)
                    .append("&text=%s&lang=en-IN-Standard-D&rpt=1");
        }
        return builder.toString();
    }
}
