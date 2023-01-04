package com.itself.example.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.Filter;

/**
 * 第二种方式,也要配合 MyFilter 的使用，建议直接使用第一种
 * @Author xxw
 * @Date 2023/01/04
 */
// @Configuration
public class FilterConfigDemo {

    @Bean
    public FilterRegistrationBean<Filter> registerFilter(){
        FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new MyFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("FilterDemo");
        registrationBean.setOrder(1);
        return registrationBean;
    }
}
