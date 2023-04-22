package com.itself.designpatterns.proxy.dynamicsproxy;

import com.itself.designpatterns.proxy.Landlord;
import com.itself.designpatterns.proxy.staticproxy.HangZhouLandlord;

/**
 * @Author xxw
 * @Date 2023/04/21
 */
public class Demo {
    public static void main(String[] args) {
        Landlord landlord = new HangZhouLandlord();
        ProxyFactory proxy = new ProxyFactory(landlord);
        Landlord proxyInstance = (Landlord)proxy.getProxyInstance();
        proxyInstance.apartmentToRent();
        System.out.println(proxyInstance.getClass());
    }
}
