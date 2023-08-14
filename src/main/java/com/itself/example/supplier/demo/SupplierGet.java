package com.itself.example.supplier.demo;

/**
 * 定义函数式接口
 * @param <T>
 */
@FunctionalInterface
public interface SupplierGet<T> {

    T get();

}