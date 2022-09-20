package com.itself.example.strategy;

/**
 * 策略模式
 * @Author xxw
 * @Date 2022/06/08
 */
public class DemoPrint {
    public static void main(String[] args) {
        LiSi liSi = new LiSi();
        Strategy context = new Strategy();
        context.setPerson(liSi);
        context.execute();
        Strategy context1 = new Strategy();
        context1.setPerson(new ZhangSan());
        context1.execute();
    }
}
