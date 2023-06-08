package com.itself.example.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 使用@EventListener注解：
 * 使用@EventListener注解可以将监听器自动注入到Spring事件框架中，
 * 同时Spring会自动管理监听器的生命周期。当监听器所在的Bean被销毁时，监听器也会被销毁
 */
@Component
@Slf4j
public class NoticeListener {
    @EventListener
    public void onApplicationEvent(NoticeEvent event) {
      log.info("listener receive the event ! sleep two second... ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("event's message is:{}",event.getMessage());
    }
}