package com.liuyanzhao.ch5.ch5_2;

/**
 * 游戏玩家接口
 * @author 言曌
 * @date 2020-01-12 12:22
 */

public interface IGamePlayer {

    /**
     * 登录
     */
    void login(String username, String password);

    /**
     * 打怪升级
     */
    void killBoss();


}
