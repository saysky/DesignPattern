package com.liuyanzhao.ch5.ch5_2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author 言曌
 * @date 2020-01-12 13:09
 */

public class Main {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");

        InvocationHandler handler = new GamePlayerHandler(player);

        // 获得 class loader
        // 动态产生一个代理者
        // 代理会帮我们实现所有的方法
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(
                player.getClass().getClassLoader(),
                new Class[] {IGamePlayer.class},
                handler);

        proxy.login("zhangsan", "123456");
        proxy.killBoss();
        proxy.killBoss();
        proxy.killBoss();
        proxy.killBoss();
    }
}
