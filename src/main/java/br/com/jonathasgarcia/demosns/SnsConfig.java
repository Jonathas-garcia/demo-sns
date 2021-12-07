package br.com.jonathasgarcia.demosns;

import com.amazonaws.services.sns.AmazonSNS;
import org.springframework.cloud.aws.messaging.core.NotificationMessagingTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SnsConfig {

//    @Bean
//    public NotificationMessagingTemplate notificationMessagingTemplate(AmazonSNS amazonSNS) {
//        return new NotificationMessagingTemplate(amazonSNS);
//    }
}
