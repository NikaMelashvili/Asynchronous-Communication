package com.melashvili.consumerrabbitconfig;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = "message_queue")
    public void listener(CustomMessage message){
        System.out.println(message);
    }
}
