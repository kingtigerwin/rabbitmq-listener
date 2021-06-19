package com.rabbitmq.rabbitmqlistener;

import com.rabbitmq.messages.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQMessageListener {

    @RabbitListener(queues = "Mobile")
    public void getMessage(User user) {
        System.out.println("User name is: " + user.getName());
    }
}
