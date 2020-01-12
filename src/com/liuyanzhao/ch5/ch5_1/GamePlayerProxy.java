package com.liuyanzhao.ch5.ch5_1;

/**
 * @author ят∙в
 * @date 2020-01-12 12:39
 */

public class GamePlayerProxy implements  IGamePlayer{

    private IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String username, String password) {
        gamePlayer.login(username, password);
    }

    @Override
    public void killBoss() {
        gamePlayer.killBoss();
    }
}
