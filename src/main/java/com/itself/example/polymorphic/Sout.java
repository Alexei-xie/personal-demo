package com.itself.example.polymorphic;

/**
 * 父类引用指向子类对象
 * @Author xxw
 * @Date 2022/06/08
 */
public class Sout {
    public static void main(String[] args) {
        Son son = new Son();
        son.println();
        son.print();
        Super s = new Son();
        s.print();
    }
}
