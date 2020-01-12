package com.liuyanzhao.ch5.ch5_1;

/**
 * @author 言曌
 * @date 2020-01-12 12:34
 */

public class Main {

    public static void main(String[] args) {
        // 没有使用代理
        IGamePlayer player = new GamePlayer("张三");
        player.login("zhangsan", "123456");
        player.killBoss();
        player.killBoss();
        player.killBoss();


        // 使用代理
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
