package com.itself.example.rabbitmq.demo05;

import com.itself.example.rabbitmq.ConnectUtil;
import com.rabbitmq.client.*;

import java.io.IOException;

import static com.itself.example.rabbitmq.demo05.TopicProducer.EXCHANGE_TOPIC;

/**
 * 消费者2
 * @Author xxw
 * @Date 2022/08/28
 */
public class TopicConsumer2 {

    public static final String TOPIC_QUEUE2 = "topic_queue2";

    public static void main(String[] argv) throws Exception {
        // 获取到连接
        Connection connection = ConnectUtil.getConnection();
        // 获取通道
        Channel channel = connection.createChannel();

        // 声明exchange，指定类型为topic
        channel.exchangeDeclare(EXCHANGE_TOPIC, "topic");
        channel.queueDeclare(TOPIC_QUEUE2, false, false, false,null);
        // 绑定队列到交换机，同时指定需要订阅的routing key。订阅 *.insert
        channel.queueBind(TOPIC_QUEUE2, EXCHANGE_TOPIC, "#.insert");
        // 定义队列的消费者
        DefaultConsumer consumer = new DefaultConsumer(channel) {
            // 获取消息，并且处理，这个方法类似事件监听，如果有消息的时候，会被自动调用
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope,
                                       AMQP.BasicProperties properties, byte[] body)throws IOException {
                // body 即消息体
                String msg = new String(body);
                System.out.println(" [topic 消费者2] received : " + msg + "!");
            }
        };
        // 监听队列，自动ACK
        channel.basicConsume(TOPIC_QUEUE2, true, consumer);
    }
}
