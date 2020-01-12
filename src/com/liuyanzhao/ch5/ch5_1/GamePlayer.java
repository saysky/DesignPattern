package com.liuyanzhao.ch5.ch5_1;

/**
 * 游戏玩家
 *
 * @author 言曌
 * @date 2020-01-12 12:26
 */
public class GamePlayer implements IGamePlayer {

    private String name;
    private Integer level;

    public GamePlayer(String name) {
        this.name = name;
        level = 1;
    }

    @Override
    public void login(String username, String password) {
        System.out.println(name + "登录成功, 用户名为" + username + ", 密码为" + password);
    }

    @Override
    public void killBoss() {
        level++;
        System.out.println(name + "杀死BOSS，升级, 当前等级 Lv" + level);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
