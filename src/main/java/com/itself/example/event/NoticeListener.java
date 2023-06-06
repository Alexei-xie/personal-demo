package com.itself.example.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author xxw
 * @Date 2023/06/06
 */
@Component
@Slf4j
public class NoticeListener implements ApplicationListener<NoticeEvent> {
    @Override
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
