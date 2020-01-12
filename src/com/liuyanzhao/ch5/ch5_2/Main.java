package com.liuyanzhao.ch5.ch5_2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author �ԕ�
 * @date 2020-01-12 13:09
 */

public class Main {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("����");

        InvocationHandler handler = new GamePlayerHandler(player);

        // ��� class loader
        // ��̬����һ��������
        // ����������ʵ�����еķ���
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
