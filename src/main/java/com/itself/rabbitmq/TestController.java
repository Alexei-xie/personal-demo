package com.itself.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Author xxw
 * @Date 2022/08/28
 */
@RestController
public class TestController {
    @Resource
    private RabbitTemplate rabbitTemplate;

    public static final String ROUTING_KEY = "heima-queue";

    @GetMapping("/send")
    public String testSend(){
        for(int i=0;i<10;i++){
            System.out.println("消息发送时间:" + System.currentTimeMillis());
//            直接向指定的队列投递消息
            rabbitTemplate.convertAndSend(ROUTING_KEY,"hello world" + (i+1));
        }
        return "ok";
    }

}
