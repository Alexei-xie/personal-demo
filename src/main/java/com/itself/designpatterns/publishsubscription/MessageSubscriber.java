package com.itself.designpatterns.publishsubscription;

/**
 * 定义一个订阅者类
 */
public class MessageSubscriber implements Subscriber {
    private String name;

    public MessageSubscriber(String name) {
        this.name = name;
    }

    // 接收消息
    public void receive(String event, Object data) {
        if ("message".equals(event)) {
            System.out.println(name + " received message: " + data);
        }
    }
}