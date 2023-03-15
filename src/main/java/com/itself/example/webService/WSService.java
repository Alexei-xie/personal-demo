package com.itself.example.webService;

import javax.jws.WebMethod;

/**
  * 这是webService的接口
  */
 // @WebService
 public interface WSService {
   @WebMethod
   String sayHello(String name);
 }