package com.itself.example.supplier.demo;

/**
 * @Author xxw
 * @Date 2023/04/14
 */
@FunctionalInterface
public interface ThrowExceptionFunction {
    /**
     * 抛出异常信息
     * @param message
     */
    void throwMessage(String message);
}
