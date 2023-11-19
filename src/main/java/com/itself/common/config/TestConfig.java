package com.itself.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * https://www.bilibili.com/video/BV1Rz4y1w7Ri/?spm_id_from=333.1007.top_right_bar_window_history.content.click&vd_source=62b998d0f040e66d18bf1b8728f62ab3
 * 2:07:00开始看，关于配置文件尽量不要使用@Component类似注解，保证底层无依赖
 * 可独自写一个配置类返回Bean对象，使用@EnableConfigurationProperties注解，属性里填写对应配置文件类.Class
 * @Author duJi
 * @Date 2023/10/24
 */
@Data
@Configuration//底层组件尽量不要使用这种类似注解
@ConfigurationProperties(prefix = "aaa")
public class TestConfig {

    private String name;
    private String age;
}
