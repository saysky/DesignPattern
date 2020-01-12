package com.liuyanzhao.ch5.ch5_1;

/**
 * ��Ϸ���
 *
 * @author �ԕ�
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
        System.out.println(name + "��¼�ɹ�, �û���Ϊ" + username + ", ����Ϊ" + password);
    }

    @Override
    public void killBoss() {
        level++;
        System.out.println(name + "ɱ��BOSS������, ��ǰ�ȼ� Lv" + level);
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
