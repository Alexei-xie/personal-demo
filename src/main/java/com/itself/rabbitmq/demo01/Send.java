package com.itself.rabbitmq.demo01;

import com.itself.rabbitmq.ConnectUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * @Author xxw
 * @Date 2022/08/26
 */
public class Send {
    public static void main(String[] argv) throws Exception {
        // 1. 建立和mq的连接
        Connection connection = ConnectUtil.getConnection();
        // 2. 从连接中创建通道，channel   使用通道才能完成消息相关的操作
        Channel channel = connection.createChannel();
        // 3. 使用信道（创建）队列
        channel.queueDeclare("simple-queue", false, false, false, null);
        // 4. 定义发送到mq的消息内容
        String message = "Hello World!";
        // 5. 向指定的队列中发送消息
        channel.basicPublish("", "simple-queue", null, message.getBytes());
        System.out.println(" [x] Provider Send :" + message);
        //关闭通道和连接
        channel.close();
        connection.close();
    }
}
