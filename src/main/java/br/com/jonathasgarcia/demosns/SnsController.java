package br.com.jonathasgarcia.demosns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.aws.messaging.config.annotation.NotificationMessage;
import org.springframework.cloud.aws.messaging.config.annotation.NotificationSubject;
import org.springframework.cloud.aws.messaging.endpoint.NotificationStatus;
import org.springframework.cloud.aws.messaging.endpoint.annotation.NotificationMessageMapping;
import org.springframework.cloud.aws.messaging.endpoint.annotation.NotificationSubscriptionMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/teste")
public class SnsController {

    private static final Logger logger = LoggerFactory.getLogger(SnsController.class);

    @NotificationMessageMapping
    public void receiveNotification(@NotificationMessage String message, @NotificationSubject String subject) {
        logger.info("Received message: {}, having subject: {}", message, subject);
    }

    @NotificationSubscriptionMapping
    public void confirmUnsubscribeMessage(@RequestBody NotificationStatus notificationStatus) {
        logger.info("Subscribed to Topic");
        notificationStatus.confirmSubscription();
    }

}
