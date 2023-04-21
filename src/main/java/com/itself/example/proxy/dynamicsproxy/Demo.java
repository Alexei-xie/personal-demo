package com.itself.example.proxy.dynamicsproxy;

import com.itself.example.proxy.Landlord;
import com.itself.example.proxy.staticproxy.HangZhouLandlord;

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
