package com.liuyanzhao.ch5.ch5_1;

/**
 * @author �ԕ�
 * @date 2020-01-12 12:34
 */

public class Main {

    public static void main(String[] args) {
        // û��ʹ�ô���
        IGamePlayer player = new GamePlayer("����");
        player.login("zhangsan", "123456");
        player.killBoss();
        player.killBoss();
        player.killBoss();


        // ʹ�ô���
        IGamePlayer playerProxy = new GamePlayerProxy(player);
        playerProxy.login("zhangsan", "123456");
        playerProxy.killBoss();
        playerProxy.killBoss();
        playerProxy.killBoss();
        playerProxy.killBoss();
        playerProxy.killBoss();
        playerProxy.killBoss();
        playerProxy.killBoss();
        playerProxy.killBoss();
        playerProxy.killBoss();

    }
}
