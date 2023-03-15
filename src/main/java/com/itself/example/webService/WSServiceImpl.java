package com.itself.example.webService;

import org.springframework.stereotype.Component;

/**
 * 启动后访问路径：http://localhost:1212/demo
 * webService的接口实现类
 */
// @WebService
@Component  // 注入spring里面，省的我们自己一个个new,而且可以使用@Validated+@Valid进行参数校验
public class WSServiceImpl implements WSService {
   @Override
   public String sayHello(String name) {
      return name+" hello,welcome to our first webService ";
   }
 }