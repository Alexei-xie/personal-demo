package com.itself.example.supplier.demo;

/**
 * @Author xxw
 * @Date 2023/08/14
 */
public class SupplierDemo {
    public static void main(String[] args) {
        for (int i = 2; i <= 3; i++) {
            testExec(i,()-> System.out.println("333"));
            testGet(i,()->{
                System.out.println("==333==");
                return 2;
            });
        }

    }

    public static <T> void testExec(int count, Supplier<T> supplier) {
        if (count > 2) {
            supplier.exec();
        } else {
            System.out.println("222");
        }
    }
    public static <T> void testGet(int count, SupplierGet<T> supplier) {
        if (count > 2) {
            T t = supplier.get();
            System.out.println(t);
        } else {
            System.out.println("222");
        }
    }
}

@FunctionalInterface
interface Supplier<T> {

    void exec();
}