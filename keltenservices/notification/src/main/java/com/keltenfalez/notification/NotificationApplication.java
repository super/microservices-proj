package com.keltenfalez.notification;

import com.keltenfalez.amqp.RabbitMQMessageProducer;
import com.keltenfalez.notification.config.NotificationConfiguration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(
        scanBasePackages = {
                "com.keltenfalez.notification",
                "com.keltenfalez.amqp",
        }
)
@EnableEurekaClient
public class NotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(RabbitMQMessageProducer producer, NotificationConfiguration notificationConfiguration) {
//        return args -> {
//            producer.publish(
//                    new Person("Ali", 18),
//                    notificationConfiguration.getInternalExchange(),
//                    notificationConfiguration.getInternalNotificationRoutingKey());
//        };
//    }
//    record Person(String name, int age) {
//    }
}
