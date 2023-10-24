package com.itself.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author duJi
 * @Date 2023/10/24
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "aaa")
public class TestConfig {

    private String name;
    private String age;
}
