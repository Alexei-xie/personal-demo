package com.itself.designpatterns.publishsubscription;

/**
 * 定义一个订阅者接口
 */
interface Subscriber {
    void receive(String event, Object data);
}