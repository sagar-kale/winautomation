package com.sagar.automation.winautomation.api;

import com.sagar.automation.winautomation.enums.NotificationType;

public final class CallmebotApi {
    private static final String WHATSAPP_API = "https://api.callmebot.com/whatsapp.php";
    private static final String WHATSAPP_API_KEY = "YOUR_WHATSAPP_API_CODE";
    private static final String TELEGRAM_API = "http://api.callmebot.com/start.php?user=@YOUR_TELEGRAM_USERNAME"; // make sure to authenticate telegram api on browser first and activate

    private CallmebotApi() {
    }

    public static String build(NotificationType type) {
        StringBuilder builder = new StringBuilder();

        if (NotificationType.WHATSAPP == type) {
            builder.append(WHATSAPP_API)1
                    .append("?phone=YOUR_PHONE_NO_WITH_COUNTRY_CODE&text=%s&apikey=") //phone number with country code e.g +919012345678
                    .append(WHATSAPP_API_KEY);
        } else {
            builder.append(TELEGRAM_API)
                    .append("&text=%s&lang=en-IN-Standard-D&rpt=1");
        }
        return builder.toString();
    }
}
