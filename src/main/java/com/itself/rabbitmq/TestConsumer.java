package com.itself.rabbitmq;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

import static com.itself.rabbitmq.TestController.ROUTING_KEY;

/**
 * @Author xxw
 * @Date 2022/08/28
 */
@Component
public class TestConsumer {
/*
    @RabbitListener(queues = ROUTING_KEY)//  注意只需要 队列名称一致即可！
    public void receive(String msg, Channel channel, Message message) throws IOException {
        //会话唯一ID
        long deliveryTag = message.getMessageProperties().getDeliveryTag();
        try {
            System.out.println("收到消息id：" + deliveryTag);
            Thread.sleep(1000);
            System.out.println("message:" +message.toString());
        }catch (Exception e){

        }
    }*/
}
