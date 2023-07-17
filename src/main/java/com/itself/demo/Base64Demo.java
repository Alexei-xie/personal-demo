package com.itself.demo;

import java.util.Base64;

/**
 * @Author xxw
 * @Date 2021/08/18
 */
public class Base64Demo {
    public static void main(String[] args) {
        // 原始数据
        byte[] data = "Hello, world!".getBytes();

        // Base64 编码
        byte[] encoded = Base64.getEncoder().encode(data);
        String encodedString = new String(encoded);
        System.out.println("Encoded string: " + encodedString);

        // Base64 解码
        byte[] decoded = Base64.getDecoder().decode(encoded);
        String decodedString = new String(decoded);
        System.out.println("Decoded string: " + decodedString);
    }
}
